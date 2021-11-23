public void glBufferSubData(int target, long offset, java.nio.ByteBuffer data) {
    android.opengl.GLES20.glBufferSubData(target, ((int) (offset)), com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data);
}