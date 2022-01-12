public void selectText(java.lang.String text) {
    wait.forElementVisible(editArea);
    java.lang.String textDump = editArea.getText();
    int from = (textDump.indexOf(text)) + 1;
    int to = (from + (text.length())) + 1;
    selectText(from, to);
}