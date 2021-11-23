private int computeTimeoutH() {
    if (mAccessibility.mFeedbackEnabled)
        return 20000;
    
    if ((mSafetyWarning) != null)
        return 5000;
    
    if ((mExpanded) || (mForceExpanded))
        return mVolumeDialogTimeout;
    
    if ((mActiveStream) == (android.media.AudioManager.STREAM_MUSIC))
        return mVolumeDialogTimeout;
    
    return mVolumeDialogTimeout;
}