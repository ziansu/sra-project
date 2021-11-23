@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
    android.opengl.GLES20.glEnable(GLES20.GL_TEXTURE_2D);
    android.opengl.GLES20.glDisable(GLES20.GL_DEPTH_TEST);
    android.opengl.GLES20.glDisable(GLES20.GL_STENCIL_TEST);
    mFilter.setTextureId(createTexture());
    mFilter.onSurfaceCreated(gl, config);
}