@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    width = (mInitialWidth) + ((int) ((mDeltaWidth) * interpolatedTime));
    if ((width) <= (mMaxWidth)) {
        mProgressView.getLayoutParams().width = width;
        mProgressView.requestLayout();
    }
}