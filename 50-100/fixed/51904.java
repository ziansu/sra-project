public void onAutoFocusMoving(boolean moving) {
    if (!(mInitialized))
        return ;
    
    if ((mPreviousMoving) == moving)
        return ;
    
    if (moving) {
        mIsAFRunning = true;
        mFocusRing.startPassiveFocus();
    }else {
        mFocusRing.stopFocusAnimations();
        mIsAFRunning = false;
        if ((mState) == (com.android.camera.FocusOverlayManager.STATE_FOCUSING_SNAP_ON_FINISH)) {
            try {
                java.lang.Thread.sleep(25);
            } catch (java.lang.InterruptedException e) {
            }
            capture();
        }
    }
    mPreviousMoving = moving;
}