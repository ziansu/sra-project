@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    mCamera.stopPreview();
    mCamera.release();
    mCamera = null;
    return false;
}