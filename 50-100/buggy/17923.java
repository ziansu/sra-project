public void delete() {
    ru.tesei7.textEditor.editor.document.Line currentLine = document.getCurrentLine();
    if ((currentLine.getOffset()) == (currentLine.getLenght())) {
        concatLines(currentLine, currentLine.getNext());
    }else {
        lineEditor.delete(currentLine);
    }
}