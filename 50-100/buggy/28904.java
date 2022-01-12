@java.lang.Override
public void moveToPreviousWord(final boolean select) {
    int offset = getCaretOffset();
    while ((offset > 1) && (!(java.lang.Character.isLetterOrDigit(document.getCharacterAt((offset - 1)))))) {
        offset--;
    } 
    while ((offset > 1) && (java.lang.Character.isLetterOrDigit(document.getCharacterAt((offset - 1))))) {
        offset--;
    } 
    this.moveTo(new org.eclipse.vex.core.provisional.dom.ContentPosition(null, offset), select);
}