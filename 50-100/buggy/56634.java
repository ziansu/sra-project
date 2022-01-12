private void initShader() {
    mProgram = cn.dream.android.opengles20.utils.ShaderUtil.createProgram(cn.dream.android.opengles20.shape.Tree.VERTEX_CODE, cn.dream.android.opengles20.shape.Tree.FRAGMENT_CODE);
    uMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    vertexHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aPosition");
    textureHandle = android.opengl.GLES20.glGetAttribLocation(mProgram, "aTexCoor");
    sTextureHandle = android.opengl.GLES20.glGetUniformLocation(mProgram, "sTexture");
}