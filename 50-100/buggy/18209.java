public void setPlainText(java.lang.String text) {
    resetDocument();
    java.io.StringReader stringReader = new java.io.StringReader(text);
    javax.swing.text.html.HTMLEditorKit editorKit = new javax.swing.text.html.HTMLEditorKit();
    try {
        editorKit.read(stringReader, document, document.getLength());
    } catch (java.lang.Exception e) {
        main.ExceptionHandler.log(e);
    }
}