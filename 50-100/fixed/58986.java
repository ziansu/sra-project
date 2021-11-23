private void notifyEditorOpened(int row, int col) {
    int lock = 0;
    if (useExternalLocking) {
        lock = externalLocks.requestLock();
    }
    for (org.vaadin.patrik.client.EditorStateManager.EditorListener l : editorListeners) {
        l.editorOpened(grid, editor, row, col, lock);
    }
}