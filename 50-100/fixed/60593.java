private void setupOpenGL() {
    glClearColor(0.1F, 0.1F, 0.1F, 1.0F);
    glEnable(engine.core.GL_DEPTH_TEST);
    glEnable(engine.core.GL_STENCIL_TEST);
    glEnable(engine.core.GL_BLEND);
    glBlendFunc(engine.core.GL_SRC_ALPHA, engine.core.GL_ONE_MINUS_SRC_ALPHA);
    if (EngineOptions.SHOW_TRIANGLES) {
        glPolygonMode(engine.core.GL_FRONT_AND_BACK, engine.core.GL_LINE);
    }else {
        glPolygonMode(engine.core.GL_FRONT_FACE, engine.core.GL_FILL);
    }
    if (EngineOptions.CULLFACE) {
        glEnable(engine.core.GL_CULL_FACE);
        glCullFace(engine.core.GL_BACK);
    }
}