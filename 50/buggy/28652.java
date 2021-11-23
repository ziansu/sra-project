public android.view.ViewPropertyAnimator animateOffScreenRight(int duration) {
    return card.animate().setDuration(SwipeDeck.ANIMATION_DURATION).x(((parentWidth) * 2)).y(0).rotation(30);
}