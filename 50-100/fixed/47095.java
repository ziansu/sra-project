private void showPrevCommandDown() {
    if ((commandHistoryIndex) == (commandHistory.size())) {
        return ;
    }
    if ((commandHistoryIndex) == ((commandHistory.size()) - 1)) {
        commandHistoryIndex = -1;
    }
    if ((commandHistoryIndex) < (commandHistory.size())) {
        (commandHistoryIndex)++;
    }
    java.lang.String text = commandHistory.get(commandHistoryIndex);
    inputBox.setText(text);
    inputBox.positionCaret(text.length());
}