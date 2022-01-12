private void tryAddRendererToVideoTrack() {
    if ((((videoRenderer) == null) && ((videoTrack) != null)) && (android.support.v4.view.ViewCompat.isAttachedToWindow(this))) {
        com.oney.WebRTCModule.SurfaceViewRenderer surfaceViewRenderer = getSurfaceViewRenderer();
        surfaceViewRenderer.init(null, rendererEvents);
        videoRenderer = new org.webrtc.VideoRenderer(surfaceViewRenderer);
        videoTrack.addRenderer(videoRenderer);
    }
}