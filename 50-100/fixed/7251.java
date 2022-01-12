public void renderSegment(lemon.engine.render.Renderable renderable) {
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_BLEND);
    org.lwjgl.opengl.GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_DEPTH_TEST);
    org.lwjgl.opengl.GL20.glUseProgram(program.getId());
    lineRenderer.render(renderable);
    org.lwjgl.opengl.GL20.glUseProgram(0);
    org.lwjgl.opengl.GL11.glDisable(GL11.GL_DEPTH_TEST);
    org.lwjgl.opengl.GL11.glDisable(GL11.GL_BLEND);
}