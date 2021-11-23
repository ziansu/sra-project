@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    float cVal = ((java.lang.Float) (animation.getAnimatedValue()));
    view.setAlpha((2 - cVal));
    view.setScaleX(cVal);
    view.setScaleY(cVal);
}