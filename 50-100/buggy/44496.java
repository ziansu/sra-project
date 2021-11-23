private void initShader() {
    mProgram = cn.dream.android.opengles20.utils.ShaderUtil.createProgram(cn.dream.android.opengles20.shape.Mountain.VERTEX_CODE, cn.dream.android.opengles20.shape.Mountain.FRAGMENT_CODE);
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    vertexHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aPosition");
    textureHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aTexCoor");
    textureGrassHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture");
    textureRockHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture2");
    startDividerHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "startDivider");
    spanDividerHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "spanDivider");
}