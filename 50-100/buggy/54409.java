@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    javax.microedition.khronos.egl.EGL10 egl = ((javax.microedition.khronos.egl.EGL10) (javax.microedition.khronos.egl.EGLContext.getEGL()));
    org.yabause.android.YabauseRunnable.lockGL();
    egl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext);
    org.yabause.android.YabauseRunnable.initViewport(width, height);
    org.yabause.android.YabauseRunnable.unlockGL();
}