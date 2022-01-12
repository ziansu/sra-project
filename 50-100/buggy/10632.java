public synchronized void log(int style, java.lang.String message) {
    try {
        javax.swing.text.StyledDocument doc = m_textPane.getStyledDocument();
        javax.swing.text.Style s = m_styles[style];
        doc.insertString(doc.getLength(), message, s);
        doc.insertString(doc.getLength(), "\n", s);
    } catch (javax.swing.text.BadLocationException e) {
        java.lang.System.err.println(e);
    }
}