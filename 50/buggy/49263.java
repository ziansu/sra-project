public void glBufferData(int target, java.nio.ByteBuffer data, int usage) {
    com.jme3.renderer.android.AndroidGL.checkPosition(data);
    android.opengl.GLES20.glBufferData(target, com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data, usage);
}