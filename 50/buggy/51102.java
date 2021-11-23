public static boolean isJoystickPresent(int joystick) {
    return (org.lwjgl.glfw.GLFW.glfwJoystickPresent(joystick)) == (org.lwjgl.glfw.GLFW.GLFW_TRUE) ? true : false;
}