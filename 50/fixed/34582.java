public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
    this.surfaceTexture = surfaceTexture;
    setSurface((surfaceTexture == null ? null : new android.view.Surface(surfaceTexture)));
}