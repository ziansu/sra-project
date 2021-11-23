public void handle(final javafx.scene.input.KeyEvent keyEvent) {
    if ((keyEvent.getCode()) == (javafx.scene.input.KeyCode.ENTER)) {
        refreshingNode(tf, event);
        applicationScreen.requestFocus();
    }
}