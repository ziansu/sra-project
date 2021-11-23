@java.lang.Override
public void render() {
    if (!(isInitialized())) {
        return ;
    }
    org.lwjgl.opengl.GL11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
    org.lwjgl.opengl.GL11.glEnableClientState(GL11.GL_COLOR_ARRAY);
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_TEXTURE_2D);
    org.lwjgl.opengl.GL11.glDisable(GL11.GL_BLEND);
    backgroundTexture.bind();
    vbo.render();
    org.nardogames.rattlesnake.common.particles.ParticleSystem.globalInstance().render();
    org.lwjgl.opengl.GL11.glDisableClientState(GL11.GL_COLOR_ARRAY);
    org.lwjgl.opengl.GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
}