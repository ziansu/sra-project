@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    if (isRippleEffectRunning) {
        float animatedValue = ((float) (animation.getAnimatedValue()));
        mCurrentRippleRadius = ((int) (animatedValue));
        mCurrentAlpha = ((int) ((com.kevalpatel.passcodeview.pinView.KeyCircle.MAX_RIPPLE_ALPHA) - (animatedValue * circleAlphaOffset)));
        mView.invalidate(mBounds);
    }
}