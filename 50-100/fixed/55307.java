public void insertText(java.lang.String ins) {
    java.lang.String lineText = getAllText();
    int pos = caret.getCaretPosition();
    java.lang.String finalText = (lineText.substring(0, pos)) + ins;
    if (pos < (lineText.length())) {
        finalText += lineText.substring(pos, lineText.length());
    }
    parse(finalText);
}