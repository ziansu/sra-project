@java.lang.Override
public void onKeyUp(int key) {
    if ((key == (org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SHIFT)) || (key == (org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT))) {
        shiftDown = false;
    }
}