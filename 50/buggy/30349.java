@java.lang.Override
public void insertString(javax.swing.text.DocumentFilter.FilterBypass fb, int offset, java.lang.String string, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
    if (willBeInteger(string, offset)) {
        super.insertString(fb, offset, string, attr);
    }
}