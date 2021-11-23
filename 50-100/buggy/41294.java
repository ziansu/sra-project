public int removeTopCardWithOffScreenTopAnimation() {
    int childCount = getChildCount();
    if ((childCount > 0) && ((getChildCount()) < ((com.daprlabs.cardstack.SwipeDeck.NUMBER_OF_CARDS) + 1))) {
        if ((swipeListener) != null) {
            swipeListener.animateOffScreenTop(400).setListener(removeTopCardOnAnimationEndAnimatorListener);
        }
    }
    return (nextAdapterCard) - (getChildCount());
}