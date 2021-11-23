public void onAutoFocusMoving(boolean moving) {
    if (!(mInitialized))
        return ;
    
    if (moving && (!(mPreviousMoving))) {
        mIsAFRunning = true;
        mFocusRing.startPassiveFocus();
    }else
        if (!moving) {
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