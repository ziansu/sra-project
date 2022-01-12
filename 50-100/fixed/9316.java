public void run(lu.innocence.opengl.core.RenderInterface renderInterface, int width, int height) {
    lu.innocence.opengl.core.DisplayManager.LOGGER.info("LWJGL - {} ", org.lwjgl.Version.getVersion());
    this.renderInterface = renderInterface;
    init(width, height);
    loop();
    org.lwjgl.glfw.Callbacks.glfwFreeCallbacks(window);
    glfwDestroyWindow(window);
    glfwTerminate();
}