private void startOverScrollAnimation(final int distanceMove) {
    final int finalDistance = getFinalOverScrollDistance();
    cancelAllAnimation();
    abortScroller();
    if ((overScrollAnimation) == null) {
        overScrollAnimation = android.animation.ValueAnimator.ofInt(distanceMove, 0);
        overScrollAnimation.addUpdateListener(overScrollAnimationUpdate);
        overScrollAnimation.addListener(overScrollAnimationListener);
    }else {
        overScrollAnimation.setIntValues(distanceMove, 0);
    }
    overScrollAnimation.setDuration(getOverScrollTime(finalDistance));
    overScrollAnimation.start();
}