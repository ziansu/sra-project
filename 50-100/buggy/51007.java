@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    view.setX(((java.lang.Float) (animation.getAnimatedValue("x"))));
    view.setY(((java.lang.Float) (animation.getAnimatedValue("y"))));
    float alpha = ((java.lang.Float) (animation.getAnimatedValue("a")));
    if (alpha > 0) {
        view.setAlpha(alpha);
    }else {
        view.setAlpha(0);
    }
    invalidate();
}