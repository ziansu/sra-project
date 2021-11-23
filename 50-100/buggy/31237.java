private void handleInsertChar(javafx.scene.input.KeyEvent e) {
    if (e.getText().equals("")) {
        return ;
    }
    currentLine = new java.lang.StringBuilder(currentLine).insert(currentPosInLine, e.getText().charAt(0)).toString();
    (charCounterInLine)++;
    (currentPosInLine)++;
    posInList = (instructions.size()) - 1;
}