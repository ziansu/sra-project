public static void shutdownGLFW() {
    if (com.jukusoft.rpg.window.system.glfw.GLFWUtils.wasShutdown.get()) {
        return ;
    }
    glfwTerminate();
    com.jukusoft.rpg.window.system.glfw.GLFWUtils.errorCallback.free();
    com.jukusoft.rpg.window.system.glfw.GLFWUtils.wasShutdown.set(true);
}