@java.lang.Override
public void handleMouseInput() throws java.io.IOException {
    super.handleMouseInput();
    int d = org.lwjgl.input.Mouse.getEventDWheel();
    if (((scrollbar) != null) && (d != 0)) {
        scrollbar.wheel(d);
    }
}