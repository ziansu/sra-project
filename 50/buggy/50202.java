private void setKeyPressed(int keyCode, boolean pressed) {
    if ((keyPressed.length) < keyCode) {
        keyPressed[keyCode] = pressed;
    }
}