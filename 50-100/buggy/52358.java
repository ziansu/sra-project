public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        editorKit.insertHTML(document, editor.getCaretPosition(), "<hr>", 0, 0, javax.swing.text.html.HTML.Tag.HR);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
        e.printStackTrace();
    }
}