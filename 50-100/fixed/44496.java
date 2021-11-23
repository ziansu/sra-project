private void initShader() {
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    vertexHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aPosition");
    textureHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aTexCoor");
    textureGrassHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture");
    textureRockHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture2");
    startDividerHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "startDivider");
    spanDividerHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "spanDivider");
}