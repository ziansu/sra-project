private void init() {
    android.graphics.Point displaySize = new android.graphics.Point();
    getWindowManager().getDefaultDisplay().getSize(displaySize);
    fr.pchab.webrtcclient.PeerConnectionParameters params = new fr.pchab.webrtcclient.PeerConnectionParameters(false, false, displaySize.x, displaySize.y, 30, 1, th.in.codia.transcriptionservice.WebRTCActivity.VIDEO_CODEC_VP9, false, 1, th.in.codia.transcriptionservice.WebRTCActivity.AUDIO_CODEC_OPUS, true);
    client = new fr.pchab.webrtcclient.WebRtcClient(this, mSocketAddress, params, org.webrtc.VideoRendererGui.getEGLContext());
}