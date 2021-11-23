public void pauseAudio() {
    if ((mAudioTrack) == null)
        return ;
    
    mAudioTrack.pause();
    mAudioTrack.flush();
    com.drbeef.quakegearvr.QGVRAudioCallback.reqThreadrunning = false;
}