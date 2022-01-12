public void removeAllCallbacks() {
    mHandlerFocus.removeCallbacks(mLostFocusChecker);
    mHandlerFocus.postDelayed(mLostFocusChecker, 50);
    mHandlerAnimation.removeCallbacks(mDoneDeblurAnimationChecker);
    mHandlerAnimation.postDelayed(mDoneDeblurAnimationChecker, 50);
}