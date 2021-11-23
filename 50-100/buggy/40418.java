private void KeyboardCallback(long window, int key, int scancode, int action, int mods) {
    if ((key == (org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE)) && (action == (org.lwjgl.glfw.GLFW.GLFW_RELEASE)))
        org.lwjgl.glfw.GLFW.glfwSetWindowShouldClose(window, org.lwjgl.opengl.GL11.GL_TRUE);
    
    char pressed = ((char) (key));
    java.lang.System.out.println(("Key Pressed: " + pressed));
    view.move(pressed, xRot);
}