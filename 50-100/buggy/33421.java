@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
    android.opengl.GLES20.glViewport(0, 0, width, height);
    float ratio = ((float) (width)) / height;
    com.dengjian.utilstest.utils.MatrixState.setProjectFrustum((-ratio), ratio, (-1), 1, 1, 1000);
    com.dengjian.utilstest.utils.MatrixState.setCamera(0, 0, 3.0F, 0, 0, 0, 0, 1.0F, 0);
    com.dengjian.utilstest.utils.MatrixState.setInitStack();
}