public android.animation.ValueAnimator obtainAnimation() {
    if ((animator) == null) {
        animator = getAnimation();
    }
    if ((animator) != null) {
        animator.addUpdateListener(this);
        animator.setStartDelay(animationDelay);
    }
    return animator;
}