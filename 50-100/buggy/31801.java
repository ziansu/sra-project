private void release() {
    android.util.Log.d(org.webrtc.MediaCodecVideoEncoder.TAG, "Java releaseEncoder");
    checkOnMediaCodecThread();
    try {
        mediaCodec.stop();
        mediaCodec.release();
    } catch (java.lang.IllegalStateException e) {
        android.util.Log.e(org.webrtc.MediaCodecVideoEncoder.TAG, "release failed", e);
    }
    mediaCodec = null;
    mediaCodecThread = null;
}