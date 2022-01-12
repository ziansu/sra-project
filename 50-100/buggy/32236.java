public android.animation.ValueAnimator obtainAnimation() {
    if ((animator) == null) {
        animator = getAnimation();
    }
    if ((animator) != null) {
        animator.setStartDelay(animationDelay);
        animator.addUpdateListener(this);
    }
    return animator;
}