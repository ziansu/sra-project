public void draw(javax.media.opengl.GL2 gl, javax.media.opengl.glu.GLU glu, com.jogamp.opengl.util.gl2.GLUT glut, robotrace.Lighting lighting) {
    terrainLoadFromImage("textures/3dtech0.jpg", 1);
    terrainScale(0, 40);
    terrainCreateDL(gl, glu, glut, 0, (-40.0F), 0, lighting);
}