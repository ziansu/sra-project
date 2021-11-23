public boolean isConnected() {
    return (org.lwjgl.glfw.GLFW.glfwGetJoystickName(((org.lwjgl.glfw.GLFW.GLFW_JOYSTICK_1) + (controllerNumber)))) != null;
}