@java.lang.Override
public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int width, int height) {
    com.aiyaapp.camera.sdk.base.Log.d("AnimE", "onSurfaceTextureSizeChanged");
    mEnv.surfaceChanged(null, 0, width, height);
}