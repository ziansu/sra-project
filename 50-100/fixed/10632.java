public synchronized void log(int style, java.lang.String message) {
    try {
        javax.swing.text.StyledDocument doc = m_textPane.getStyledDocument();
        doc.insertString(doc.getLength(), message, m_styles[style]);
    } catch (javax.swing.text.BadLocationException e) {
        java.lang.System.err.println(e);
    }
}