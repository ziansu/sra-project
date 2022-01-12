private void highlightRow(android.view.View view) {
    com.google.common.base.Preconditions.checkNotNull(view, "view shouldn't be null");
    float width = (view.getWidth()) / 20;
    android.animation.ObjectAnimator animator = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0, (-width), width, 0);
    animator.setInterpolator(null);
    animator.start();
}