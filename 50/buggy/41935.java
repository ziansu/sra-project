private void notifyDataChanged(java.lang.String newContent, int row, int col) {
    com.vaadin.client.VConsole.log("notifyDataChanged");
    for (org.vaadin.patrik.client.EditorStateManager.EditorListener l : editorListeners) {
        l.dataChanged(grid, editor, getCurrentEditorWidget(), newContent, row, col);
    }
}