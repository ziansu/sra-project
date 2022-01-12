public void close() {
    open = false;
    for (com.ezardlabs.dethsquare.GameObject piece : pieces) {
        piece.setActive(false);
    }
    for (com.ezardlabs.dethsquare.GameObject highlight : highlights) {
        highlight.setActive(false);
    }
    for (com.ezardlabs.dethsquare.GameObject text : texts) {
        text.setActive(false);
    }
    com.ezardlabs.dethsquare.Time.resume();
    com.ezardlabs.dethsquare.Screen.setCursorVisible(false);
}