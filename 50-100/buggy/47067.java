public void resetDocument() {
    if ((document) != null) {
        document.removeUndoableEditListener(view.getUndoListener());
        document = ((javax.swing.text.html.HTMLDocument) (new javax.swing.text.html.HTMLEditorKit().createDefaultDocument()));
        document.addUndoableEditListener(view.getUndoListener());
        view.update();
    }
}