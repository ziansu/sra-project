public void prepare() {
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_DEPTH_TEST);
    org.lwjgl.opengl.GL11.glClear(((org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT) | (org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT)));
    org.lwjgl.opengl.GL11.glClearColor(0.0F, 0.0F, 0.0F, 1);
}