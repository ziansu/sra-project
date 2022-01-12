public void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, java.nio.ByteBuffer data) {
    android.opengl.GLES20.glTexImage2D(target, level, format, width, height, 0, format, type, data);
}