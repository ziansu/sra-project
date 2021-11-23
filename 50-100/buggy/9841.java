private void init() {
    android.graphics.Point displaySize = new android.graphics.Point();
    getWindowManager().getDefaultDisplay().getSize(displaySize);
    fr.pchab.AndroidRTC.PeerConnectionParameters params = new fr.pchab.AndroidRTC.PeerConnectionParameters(true, false, displaySize.x, displaySize.y, 30, 1, fr.pchab.AndroidRTC.RTCActivity.VIDEO_CODEC_VP9, true, 1, fr.pchab.AndroidRTC.RTCActivity.AUDIO_CODEC_OPUS, true);
    org.webrtc.PeerConnectionFactory.initializeAndroidGlobals(this, true, true, params.videoCodecHwAcceleration, org.webrtc.VideoRendererGui.getEGLContext());
    client = new fr.pchab.AndroidRTC.WebRtcClient(this, mSocketAddress);
}