public void backspace() {
    ru.tesei7.textEditor.editor.document.Line currentLine = document.getCurrentLine();
    if ((currentLine.getOffset()) == 0) {
        concatLines(currentLine.getPrevious(), currentLine, true);
    }else {
        lineEditor.backspace(currentLine);
    }
}