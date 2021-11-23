private static void startCountAnimation(final android.widget.TextView textView, int start, int end) {
    android.animation.ValueAnimator animator = new android.animation.ValueAnimator();
    animator.setObjectValues(start, end);
    animator.setDuration(2000);
    animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
        public void onAnimationUpdate(android.animation.ValueAnimator animation) {
            textView.setText(("" + ((int) (animation.getAnimatedValue()))));
        }
    });
    animator.start();
}