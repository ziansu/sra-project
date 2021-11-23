public void loadGLTexture(final android.content.Context context, final int texture) {
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inSampleSize = 4;
    final android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(context.getResources(), texture, options);
    android.opengl.GLES20.glGenTextures(1, this.mTextures, 0);
    android.opengl.GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, this.mTextures[0]);
    android.opengl.GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_NEAREST);
    android.opengl.GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
    texImage2D(bitmap);
}