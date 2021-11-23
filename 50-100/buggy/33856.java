@java.lang.Override
public void reshape(com.jogamp.opengl.GLAutoDrawable drawable, int x, int y, int width, int height) {
    com.jogamp.opengl.GL2ES2 gl = ((com.jogamp.opengl.GL2ES2) (drawable.getGL()));
    gl.glViewport(0, 0, width, height);
}