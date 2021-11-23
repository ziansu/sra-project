private void animateTheShitter(float start, float end) {
    if (mEnabled) {
        android.animation.ObjectAnimator animator = android.animation.ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, start, end);
        animator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animator.setDuration(200);
        animator.start();
    }
}