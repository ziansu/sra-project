private void handleLeft(javafx.scene.input.KeyEvent e) {
    if (((currentPosInLine) > 0) && (((this.getLength()) - (this.getCaretPosition())) <= (charCounterInLine))) {
        currentPosInLine = java.lang.Math.max(((currentPosInLine) - 1), 0);
    }else {
        e.consume();
    }
}