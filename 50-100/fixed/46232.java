private void handleRight(javafx.scene.input.KeyEvent e) {
    if (((currentPosInLine) < (charCounterInLine)) && ((((this.getLength()) - 1) - (this.getCaretPosition())) <= (charCounterInLine))) {
        (currentPosInLine)++;
    }else {
        e.consume();
    }
}