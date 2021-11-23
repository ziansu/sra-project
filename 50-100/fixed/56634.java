private void initShader() {
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    vertexHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aPosition");
    textureHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aTexCoor");
    sTextureHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture");
}