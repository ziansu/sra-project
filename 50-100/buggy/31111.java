private void updateVideoView() {
    org.webrtc.VideoRendererGui.update(remoteRender, org.appspot.apprtc.CallActivity.REMOTE_X, org.appspot.apprtc.CallActivity.REMOTE_Y, org.appspot.apprtc.CallActivity.REMOTE_WIDTH, org.appspot.apprtc.CallActivity.REMOTE_HEIGHT, scalingType);
    if (iceConnected) {
        org.webrtc.VideoRendererGui.update(localRender, org.appspot.apprtc.CallActivity.LOCAL_X_CONNECTED, org.appspot.apprtc.CallActivity.LOCAL_Y_CONNECTED, org.appspot.apprtc.CallActivity.LOCAL_WIDTH_CONNECTED, org.appspot.apprtc.CallActivity.LOCAL_HEIGHT_CONNECTED, ScalingType.SCALE_ASPECT_FIT);
    }else {
        org.webrtc.VideoRendererGui.update(localRender, org.appspot.apprtc.CallActivity.LOCAL_X_CONNECTING, org.appspot.apprtc.CallActivity.LOCAL_Y_CONNECTING, org.appspot.apprtc.CallActivity.LOCAL_WIDTH_CONNECTING, org.appspot.apprtc.CallActivity.LOCAL_HEIGHT_CONNECTING, scalingType);
    }
}