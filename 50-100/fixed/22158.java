@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    float value = ((float) (animation.getAnimatedValue()));
    mCurrentMatrix.setScale(value, value, mCurrentZoomPoint.x, mCurrentZoomPoint.y);
    postInvalidate();
    if (value == scale) {
        mHandler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                adjustPosition();
            }
        }, 100);
        isZooming = false;
    }
}