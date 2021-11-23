public static void createDisplay() {
    org.lwjgl.opengl.ContextAttribs attribs = new org.lwjgl.opengl.ContextAttribs(3, 2);
    attribs.withForwardCompatible(true);
    attribs.withProfileCore(true);
    try {
        org.lwjgl.opengl.Display.setDisplayMode(new org.lwjgl.opengl.DisplayMode(renderEngine.DisplayManager.WIDTH, renderEngine.DisplayManager.HEIGHT));
        org.lwjgl.opengl.Display.create(new org.lwjgl.opengl.PixelFormat(), attribs);
        org.lwjgl.opengl.Display.setTitle("Our Game Display!");
    } catch (org.lwjgl.LWJGLException e) {
        e.printStackTrace();
    }
    org.lwjgl.opengl.GL11.glViewport(0, 0, renderEngine.DisplayManager.WIDTH, renderEngine.DisplayManager.HEIGHT);
}