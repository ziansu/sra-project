private void startTouchAnimation(int animationDelay, final long touchTime, long secondTouchOffset) {
    long startOffset = (animationDelay > 0) ? animationDelay * (org.literacyapp.handgesture.Constants.MILLISECONDS) : (org.literacyapp.handgesture.Constants.DEFAULT_ANIMATION_DELAY) * (org.literacyapp.handgesture.Constants.MILLISECONDS);
    if (isSecondTouchOfDoubleTouchGesture(secondTouchOffset)) {
        startOffset = secondTouchOffset;
    }
    android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
    animationSet.addAnimation(getZoomOutAnimation(startOffset, touchTime));
    animationSet.addAnimation(getZoomInAnimation(startOffset, touchTime));
    mView.setAnimation(animationSet);
    animationSet.start();
}