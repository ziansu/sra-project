@java.lang.Override
public void run() {
    synchronized(layoutLock) {
        if ((((eglBase) != null) && (isSurfaceCreated)) && (!(eglBase.hasSurface()))) {
            eglBase.createSurface(getHolder().getSurface());
            eglBase.makeCurrent();
            android.opengl.GLES20.glPixelStorei(GLES20.GL_UNPACK_ALIGNMENT, 1);
        }
    }
}