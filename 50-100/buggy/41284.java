public static int getDocumentPosition(javax.swing.text.JTextComponent editor, int line, int column) {
    int lineHeight = editor.getFontMetrics(editor.getFont()).getHeight();
    int charWidth = editor.getFontMetrics(editor.getFont()).charWidth('m');
    int y = line * lineHeight;
    int x = column * charWidth;
    java.awt.Point pt = new java.awt.Point(x, y);
    int pos = editor.viewToModel(pt);
    return pos;
}