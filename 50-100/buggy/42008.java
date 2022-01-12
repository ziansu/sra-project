private void animateOffsetToStartPosition(int from, android.view.animation.Animation.AnimationListener listener) {
    if ((computeAnimateToStartDuration(from)) <= 0) {
        listener.onAnimationStart(null);
        listener.onAnimationEnd(null);
        return ;
    }
    mFrom = from;
    mAnimateToStartAnimation.reset();
    mAnimateToStartAnimation.setDuration(computeAnimateToStartDuration(from));
    mAnimateToStartAnimation.setInterpolator(mAnimateToStartInterpolator);
    if (listener != null) {
        mAnimateToStartAnimation.setAnimationListener(listener);
    }
    clearAnimation();
    startAnimation(mAnimateToStartAnimation);
}