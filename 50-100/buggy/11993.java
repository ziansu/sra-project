@java.lang.Override
protected void keyDown(int eventKey, char ch, boolean shift, boolean ctrl, boolean alt, boolean special) throws java.lang.Exception {
    switch (ch) {
        case 'm' :
            org.lwjgl.input.Mouse.setGrabbed((!(org.lwjgl.input.Mouse.isGrabbed())));
            break;
    }
}