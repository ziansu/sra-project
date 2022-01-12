private void MouseButtonCallback(long window, int button, int state, int arg3) {
    java.lang.System.out.println(((((button + " ") + state) + " ") + arg3));
    if ((button == (org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_1)) && (state == 0)) {
        mouse_down = state == 1;
        toInteract = world.closestEntity(current.getLocation(), 10.0F);
    }
}