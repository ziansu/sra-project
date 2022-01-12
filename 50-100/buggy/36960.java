private boolean isCurrentLine(int rowStartOffset) {
    int caretPosition = component.getCaretPosition();
    javax.swing.text.Element root = component.getDocument().getDefaultRootElement();
    if ((root.getElementIndex(rowStartOffset)) == (root.getElementIndex(caretPosition)))
        return true;
    else
        return false;
    
}