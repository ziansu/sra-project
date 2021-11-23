@java.lang.Override
public void insertString(int offs, java.lang.String str, javax.swing.text.AttributeSet a) throws javax.swing.text.BadLocationException {
    super.insertString(offs, str, a);
    org.xxxmathxxx.tddt.gui.ide.SyntaxHighlighting.getInstance().checkHighlighting(this);
}