private android.view.ViewPropertyAnimator animateOffScreenLeft() {
    return card.animate().setDuration(150).x((-(parent.getWidth()))).y(0).rotation((-30));
}