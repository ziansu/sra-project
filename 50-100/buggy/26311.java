public void init(com.jogamp.opengl.GLAutoDrawable drawable) {
    scene = com.company.SceneGenerators.cloth(scene);
    scene.addObject(new com.company.Plane());
    gl = drawable.getGL().getGL2();
    glu = new com.jogamp.opengl.glu.GLU();
    gl.glClearColor(0.1F, 0.1F, 0.1F, 0.0F);
    gl.glEnable(GL2.GL_DEPTH_TEST);
    gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST);
    gl.glEnable(GL2.GL_BLEND);
    gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
}