private void showPrevCommandUp() {
    if ((commandHistory.size()) == 0) {
        return ;
    }
    if ((commandHistoryIndex) == 0) {
        commandHistoryIndex = commandHistory.size();
    }
    if ((commandHistoryIndex) > 0) {
        (commandHistoryIndex)--;
    }
    java.lang.String text = commandHistory.get(commandHistoryIndex);
    inputBox.setText(text);
    inputBox.positionCaret(text.length());
}