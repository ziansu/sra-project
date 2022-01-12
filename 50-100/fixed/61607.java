private void highlightRow(android.view.View view) {
    float width = (view.getWidth()) / 20;
    android.animation.ObjectAnimator animator = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0, (-width), width, 0);
    animator.setInterpolator(null);
    animator.start();
}