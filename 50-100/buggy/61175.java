private void stopRecording0() {
    if ((mVolumeHandler) != null)
        mVolumeHandler.removeCallbacks(mShowVolumeTask);
    
    if ((mStopHandler) != null)
        mStopHandler.removeCallbacks(mStopTask);
    
    releaseRecorder();
    if ((mAudioPauser) != null)
        mAudioPauser.resume();
    
}