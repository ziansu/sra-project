private void stopRecording0() {
    releaseRecorder();
    if ((mVolumeHandler) != null)
        mVolumeHandler.removeCallbacks(mShowVolumeTask);
    
    if ((mStopHandler) != null)
        mStopHandler.removeCallbacks(mStopTask);
    
    if ((mAudioPauser) != null)
        mAudioPauser.resume();
    
}