public void glUniform4(int location, java.nio.IntBuffer value) {
    android.opengl.GLES20.glUniform4iv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, 4), value);
}