public void actionPerformed(java.awt.event.ActionEvent event) {
    java.lang.String tdTag = "<td><p></p></td>";
    javax.swing.text.Element td = document.getParagraphElement(editor.getCaretPosition()).getParentElement();
    try {
        document.insertAfterEnd(td, tdTag);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
        e.printStackTrace();
    }
}