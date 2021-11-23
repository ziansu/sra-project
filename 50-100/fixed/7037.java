public void initProgram() {
    vertexHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aPosition");
    textureHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aTexture");
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    sTextureHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture");
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
}