@java.lang.Override
public void init(interaction.GLAutoDrawable drawable) {
    interaction.GL2 gl = drawable.getGL().getGL2();
    gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
    gl.glBlendFunc(GL2.GL_ONE, GL2.GL_ONE);
    setupShaders(gl);
}