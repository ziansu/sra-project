public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, java.nio.ByteBuffer data) {
    com.jme3.renderer.android.AndroidGL.checkPosition(data);
    android.opengl.GLES20.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data);
}