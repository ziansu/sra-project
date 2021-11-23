private void handleRight(javafx.scene.input.KeyEvent e) {
    if (((currentPosInLine) < (charCounterInLine)) && (((this.getLength()) - (this.getCaretPosition())) <= (charCounterInLine))) {
        (currentPosInLine)++;
    }else {
        e.consume();
    }
}