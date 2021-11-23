private boolean isCurrentLine(int rowStartOffset) {
    int caretPosition = component.getCaretPosition();
    javax.swing.text.Element root = component.getDocument().getDefaultRootElement();
    return (root.getElementIndex(rowStartOffset)) == (root.getElementIndex(caretPosition));
}