public void actionPerformed(java.awt.event.ActionEvent event) {
    try {
        undo.redo();
    } catch (javax.swing.undo.CannotRedoException e) {
        java.lang.System.out.println(e.toString());
        e.printStackTrace();
    }
    update();
    undoAction.update();
}