void resumeRecording() {
    if (com.serenegiant.media.MediaEncoder.DEBUG)
        android.util.Log.v(com.serenegiant.media.MediaEncoder.TAG, "resumeRecording");
    
    synchronized(mSync) {
        if ((!(mIsCapturing)) || (mRequestStop)) {
            return ;
        }
        offsetPTSUs = (mLastPausedTimeUs) - ((java.lang.System.nanoTime()) / 1000);
        mRequestPause = false;
        mSync.notifyAll();
    }
}