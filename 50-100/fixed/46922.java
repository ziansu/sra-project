public void initGL() {
    if ((windowId) == (-1))
        throw new java.lang.IllegalStateException("cannot init OpenGL before a window is created");
    
    org.lwjgl.opengl.GL.createCapabilities();
    java.lang.System.out.println(("OpenGL: " + (glGetString(engine.window.GL_VERSION))));
    glEnable(engine.window.GL_BLEND);
    glBlendFunc(engine.window.GL_SRC_ALPHA, engine.window.GL_ONE_MINUS_SRC_ALPHA);
    glEnable(engine.window.GL_DEPTH_TEST);
    glActiveTexture(engine.window.GL_TEXTURE0);
    glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLinitialized = true;
}