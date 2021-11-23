private static void setUpDisplay() {
    try {
        org.lwjgl.opengl.Display.setDisplayMode(new org.lwjgl.opengl.DisplayMode(com.totn.mainGame.SinglePlayer.width, com.totn.mainGame.SinglePlayer.height));
        org.lwjgl.opengl.Display.create();
    } catch (org.lwjgl.LWJGLException e) {
        e.printStackTrace();
        org.lwjgl.opengl.Display.destroy();
        java.lang.System.exit(1);
    }
}