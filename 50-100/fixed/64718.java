private void tryAddRendererToVideoTrack() {
    if ((((videoRenderer) == null) && ((videoTrack) != null)) && (isAttachedToWindow())) {
        com.oney.WebRTCModule.SurfaceViewRenderer surfaceViewRenderer = getSurfaceViewRenderer();
        surfaceViewRenderer.init(null, rendererEvents);
        videoRenderer = new org.webrtc.VideoRenderer(surfaceViewRenderer);
        videoTrack.addRenderer(videoRenderer);
    }
}