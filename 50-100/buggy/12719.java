@java.lang.Override
public void stop() {
    org.webrtc.Logging.d(org.webrtc.Camera1Session.TAG, ("Stop camera1 session on camera " + (cameraId)));
    checkIsOnCameraThread();
    if ((state) != (org.webrtc.Camera1Session.SessionState.STOPPED)) {
        final long stopStartTime = java.lang.System.nanoTime();
        state = org.webrtc.Camera1Session.SessionState.STOPPED;
        stopInternal();
        final int stopTimeMs = ((int) (java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(((java.lang.System.nanoTime()) - stopStartTime))));
        org.webrtc.Camera1Session.camera1StopTimeMsHistogram.addSample(stopTimeMs);
    }
}