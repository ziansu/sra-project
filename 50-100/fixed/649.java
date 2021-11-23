@java.lang.Override
public boolean keyDown(int keycode) {
    if (readInput) {
        if (keycode == (Input.Keys.ENTER))
            inputReady = true;
        
        if (keycode == (Input.Keys.BACKSPACE)) {
            input = new java.lang.StringBuilder();
            text = (fullText) + (cursor ? "_" : " ");
        }
    }
    return false;
}