@java.lang.Override
public void remove(final int offs, final int len) throws javax.swing.text.BadLocationException {
    changed |= !(programmatic);
    lastCaret = textPane.getCaretPosition();
    synchronized(this) {
        if (len > 0) {
            super.remove(offs, len);
            if ((reader) != null)
                reader.update(offs, (-len));
            
        }
    }
}