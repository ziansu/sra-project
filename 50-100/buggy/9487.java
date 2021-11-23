public void open() {
    open = true;
    for (com.ezardlabs.dethsquare.GameObject piece : pieces) {
        piece.setActive(true);
    }
    for (com.ezardlabs.dethsquare.GameObject highlight : highlights) {
        highlight.setActive(false);
    }
    for (com.ezardlabs.dethsquare.GameObject text : texts) {
        text.setActive(true);
    }
    com.ezardlabs.dethsquare.Time.pause();
    com.ezardlabs.dethsquare.Screen.setCursorVisible(true);
}