@java.lang.Override
protected void onDrawArraysPre() {
    if ((mFilterSecondTextureCoordinateAttribute) >= 0) {
        android.opengl.GLES20.glEnableVertexAttribArray(mFilterSecondTextureCoordinateAttribute);
        mTexture2CoordinatesBuffer.position(0);
        android.opengl.GLES20.glVertexAttribPointer(mFilterSecondTextureCoordinateAttribute, 2, GLES20.GL_FLOAT, false, 0, mTexture2CoordinatesBuffer);
    }
    android.opengl.GLES20.glActiveTexture(GLES20.GL_TEXTURE3);
    android.opengl.GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, mFilterSourceTexture2);
    android.opengl.GLES20.glUniform1i(mFilterInputTextureUniform2, 3);
}