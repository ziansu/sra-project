@java.lang.Override
protected void animateVisibility(boolean toVisible) {
    if ((isVisible) == toVisible) {
        return ;
    }
    if ((!(hideEmptyTextContainer)) || (!(isTextContainerEmpty()))) {
        textContainer.startAnimation(new com.devbrackets.android.exomedia.ui.animation.TopViewHideShowAnimation(textContainer, toVisible, CONTROL_VISIBILITY_ANIMATION_LENGTH));
    }
    if (!(isLoading)) {
        controlsContainer.startAnimation(new com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation(controlsContainer, toVisible, CONTROL_VISIBILITY_ANIMATION_LENGTH));
    }
    isVisible = toVisible;
    onVisibilityChanged();
}