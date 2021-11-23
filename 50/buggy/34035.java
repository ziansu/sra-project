private void notifyEditorClosed(int row, int col, boolean cancel) {
    com.vaadin.client.VConsole.log("notifyEditorClosed");
    for (org.vaadin.patrik.client.EditorStateManager.EditorListener l : editorListeners) {
        l.editorClosed(grid, editor, row, col, cancel);
    }
}