@java.lang.Override
protected void onStart() {
    super.onStart();
    android.animation.PropertyValuesHolder holder1 = android.animation.PropertyValuesHolder.ofFloat("scaleX", 0.0F, 5.0F);
    android.animation.PropertyValuesHolder holder2 = android.animation.PropertyValuesHolder.ofFloat("scaleY", 0.0F, 5.0F);
    android.animation.ObjectAnimator animator = android.animation.ObjectAnimator.ofPropertyValuesHolder(mFAB, holder1, holder2).setDuration(350);
    animator.start();
}