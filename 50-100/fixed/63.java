@java.lang.Override
public void insertString(final int offs, final java.lang.String str, final javax.swing.text.AttributeSet a) throws javax.swing.text.BadLocationException {
    changed |= !(programmatic);
    lastCaret = textPane.getCaretPosition();
    synchronized(this) {
        super.insertString(offs, str, a);
        if ((reader) != null)
            reader.update(offs, str.length());
        
    }
}