public android.animation.ValueAnimator obtainAnimation() {
    if ((animator) == null) {
        animator = getAnimation();
        if ((animator) != null) {
            animator.addUpdateListener(this);
        }
    }
    if ((animator) != null) {
        animator.setStartDelay(animationDelay);
    }
    return animator;
}