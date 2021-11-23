public void setPlainText(java.lang.String text) {
    resetDocument();
    java.io.StringReader stringReader = new java.io.StringReader(text);
    try {
        new javax.swing.text.html.HTMLEditorKit().read(stringReader, document, 0);
    } catch (java.lang.Exception e) {
        main.ExceptionHandler.log(e);
    }
}