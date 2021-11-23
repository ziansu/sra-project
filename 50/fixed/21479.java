@java.lang.Override
public void onAnimationUpdate(com.nineoldandroids.animation.ValueAnimator animation) {
    float alpha = ((float) (animation.getAnimatedValue()));
    mHeaderColorIsChanging = alpha != 1;
    changeHeaderBarColor(alpha);
}