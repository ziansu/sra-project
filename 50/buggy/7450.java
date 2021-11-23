@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    android.util.Log.d("Animate", ((animation.getAnimatedValue()) + ""));
    animateAlpha = 255 - ((java.lang.Integer) (animation.getAnimatedValue()));
    invalidate();
}