@java.lang.Override
public void onGlobalLayout() {
    arrangeLayoutAccordingToScreenOrientation_priv(orientation);
    imageParentFrame.getViewTreeObserver().removeOnGlobalLayoutListener(this);
}