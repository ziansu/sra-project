@java.lang.Override
public boolean isPressed(int keyCode) {
    return (keyPressed.length) < keyCode ? keyPressed[keyCode] : false;
}