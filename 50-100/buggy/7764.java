protected void initTableColumns(org.eclipse.jface.layout.TreeColumnLayout treeLayout, boolean keepColumnStatus) {
    if ((treeViewer) != null) {
        org.eclipse.swt.widgets.Tree tree = treeViewer.getTree();
        if ((tree != null) && (!(tree.isDisposed()))) {
            initTableColumns(tree, treeLayout, keepColumnStatus);
        }
    }
}