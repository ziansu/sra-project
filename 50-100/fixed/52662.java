@java.lang.Override
public void onAddRemoteStream(org.webrtc.MediaStream remoteStream, int endPoint) {
    remoteStream.videoTracks.get(0).addRenderer(new org.webrtc.VideoRenderer(remoteRender));
    org.webrtc.VideoRendererGui.update(remoteRender, fr.pchab.androidrtc.RtcActivity.REMOTE_X, fr.pchab.androidrtc.RtcActivity.REMOTE_Y, fr.pchab.androidrtc.RtcActivity.REMOTE_WIDTH, fr.pchab.androidrtc.RtcActivity.REMOTE_HEIGHT, scalingType);
    org.webrtc.VideoRendererGui.update(localRender, fr.pchab.androidrtc.RtcActivity.LOCAL_X_CONNECTED, fr.pchab.androidrtc.RtcActivity.LOCAL_Y_CONNECTED, fr.pchab.androidrtc.RtcActivity.LOCAL_WIDTH_CONNECTED, fr.pchab.androidrtc.RtcActivity.LOCAL_HEIGHT_CONNECTED, scalingType);
}