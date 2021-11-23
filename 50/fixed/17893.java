@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i("GameActivity", "surfaceDestroyed");
    paulscode.android.mupen64plusae.jni.NativeExports.notifySDLSurfaceDestroyed();
    mSurface.setEGLContextNotReady();
    mIsSurface = false;
}