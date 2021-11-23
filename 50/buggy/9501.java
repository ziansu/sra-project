@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    window.setStatusBarColor(((java.lang.Integer) (valueAnimator.getAnimatedValue())));
}