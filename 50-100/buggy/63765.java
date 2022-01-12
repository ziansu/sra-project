private void updateCursorPosition() {
    try (final org.lwjgl.system.MemoryStack stack = org.lwjgl.system.MemoryStack.stackPush()) {
        final java.nio.DoubleBuffer x = stack.mallocDouble(1);
        final java.nio.DoubleBuffer y = stack.mallocDouble(1);
        org.lwjgl.glfw.GLFW.glfwGetCursorPos(this.windowHandle, x, y);
        com.adrien.games.bagl.core.Input.handleMouseMove(this.windowHandle, x.get(), (-(y.get())));
    }
}