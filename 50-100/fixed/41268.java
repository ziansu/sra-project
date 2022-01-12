@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
    android.opengl.GLES20.glEnable(GLES20.GL_TEXTURE_2D);
    mFilter.setTextureId(createTexture());
    mFilter.onSurfaceCreated(gl, config);
}