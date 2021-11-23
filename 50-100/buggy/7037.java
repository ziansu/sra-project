public void initProgram(java.lang.String vertexCode, java.lang.String fragCode) {
    mProgram = cn.dream.android.opengles20.utils.ShaderUtil.createProgram(vertexCode, fragCode);
    vertexHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aPosition");
    textureHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aTexture");
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    sTextureHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture");
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
}