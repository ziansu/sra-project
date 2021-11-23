@java.lang.Override
public boolean keyDown(int keycode) {
    if (readInput) {
        if (keycode == (Input.Keys.ENTER))
            inputReady = true;
        
        if (keycode == (Input.Keys.BACKSPACE)) {
            input = "";
            text = (fullText) + (cursor ? "_" : " ");
        }
    }
    return false;
}