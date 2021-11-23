@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    emExoPlayer.setSurface(new android.view.Surface(surfaceTexture));
    if (playRequested) {
        emExoPlayer.setPlayWhenReady(true);
    }
}