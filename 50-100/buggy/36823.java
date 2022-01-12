@java.lang.Override
public void onInit() {
    super.onInit();
    mFilterSecondTextureCoordinateAttribute = android.opengl.GLES20.glGetAttribLocation(getProgram(), "inputTextureCoordinate2");
    mFilterInputTextureUniform2 = android.opengl.GLES20.glGetUniformLocation(getProgram(), "inputImageTexture2");
    android.opengl.GLES20.glEnableVertexAttribArray(mFilterSecondTextureCoordinateAttribute);
    if (((mBitmap) != null) && (!(mBitmap.isRecycled()))) {
        setBitmap(mBitmap);
    }
}