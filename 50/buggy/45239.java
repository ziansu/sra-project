private void handleSelectionOnTree() {
    if (((leftTreeViewer) == null) || (leftTreeViewer.getControl().isDisposed())) {
        return ;
    }
    refreshTableViewer();
}