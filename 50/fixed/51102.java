public static boolean isJoystickPresent(int joystick) {
    return org.lwjgl.glfw.GLFW.glfwJoystickPresent(joystick) ? true : false;
}