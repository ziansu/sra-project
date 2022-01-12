private javax.swing.text.StyledDocument getDocument(java.io.InputStream inputStream) {
    java.lang.String data = getStringOfStream(inputStream);
    document = new javax.swing.text.DefaultStyledDocument();
    try {
        document.insertString(0, data, null);
    } catch (javax.swing.text.BadLocationException e) {
        e.printStackTrace();
    }
    return document;
}