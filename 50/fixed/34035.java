private void notifyEditorClosed(int row, int col, boolean cancel) {
    for (org.vaadin.patrik.client.EditorStateManager.EditorListener l : editorListeners) {
        l.editorClosed(grid, editor, row, col, cancel);
    }
}