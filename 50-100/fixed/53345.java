void update() {
    if ((listenerInitialized) == false) {
        initializeListener();
    }
    synchronized(runnables) {
        executedRunnables.addAll(runnables);
        runnables.clear();
    }
    for (java.lang.Runnable runnable : executedRunnables) {
        runnable.run();
    }
    executedRunnables.clear();
    if (!(iconified)) {
        graphics.update();
        listener.render();
        org.lwjgl.glfw.GLFW.glfwSwapBuffers(windowHandle);
        input.update();
    }
}