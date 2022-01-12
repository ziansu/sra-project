public boolean isConnected() {
    java.lang.String name = org.lwjgl.glfw.GLFW.glfwGetJoystickName(((org.lwjgl.glfw.GLFW.GLFW_JOYSTICK_1) + (controllerNumber)));
    return (name != null) && (!(name.isEmpty()));
}