protected void initTableColumns(boolean keepColumnStatus) {
    if ((treeViewer) != null) {
        org.eclipse.swt.widgets.Tree tree = treeViewer.getTree();
        if ((tree != null) && (!(tree.isDisposed()))) {
            initTableColumns(tree, keepColumnStatus);
        }
    }
}