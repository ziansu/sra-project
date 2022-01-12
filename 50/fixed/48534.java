public void glUniform1(int location, java.nio.IntBuffer value) {
    android.opengl.GLES20.glUniform1iv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, 1), value);
}