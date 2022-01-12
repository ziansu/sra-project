public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, java.nio.ByteBuffer data) {
    android.opengl.GLES20.glCompressedTexImage2D(target, level, internalformat, width, height, 0, com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data);
}