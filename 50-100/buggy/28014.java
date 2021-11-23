public void start() {
    if ((!(opened)) || (started))
        return ;
    
    rtpReceiver.startSession();
    rtspControl.play();
    while ((rtspControl.getState()) != (edu.tfnrc.rtsp.RtspConstants.PLAYING)) {
    } 
    videoStartTime = android.os.SystemClock.uptimeMillis();
    started = true;
    android.util.Log.d(edu.tfnrc.rtp.RtpVideoRenderer.TAG, "start renderer successfully");
}