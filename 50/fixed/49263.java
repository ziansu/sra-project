public void glBufferData(int target, java.nio.ByteBuffer data, int usage) {
    android.opengl.GLES20.glBufferData(target, com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data, usage);
}