private void animateOffsetToStartPosition(int from, android.view.animation.Animation.AnimationListener listener) {
    mFrom = from;
    mAnimateToStartAnimation.reset();
    mAnimateToStartAnimation.setDuration(mAnimateDuration);
    mAnimateToStartAnimation.setInterpolator(mInterpolator);
    if (listener != null) {
        mAnimateToStartAnimation.setAnimationListener(listener);
    }
    clearAnimation();
    startAnimation(mAnimateToStartAnimation);
}