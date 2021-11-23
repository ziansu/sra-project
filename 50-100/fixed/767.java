protected static java.lang.Object getModelObject(javax.swing.JComponent c) {
    if (c instanceof javax.swing.JTree) {
        final javax.swing.tree.TreePath path = ((javax.swing.JTree) (c)).getSelectionPath();
        if (path != null) {
            final java.lang.Object pathComponent = path.getLastPathComponent();
            if (pathComponent instanceof javax.swing.tree.DefaultMutableTreeNode) {
                final javax.swing.tree.DefaultMutableTreeNode node = ((javax.swing.tree.DefaultMutableTreeNode) (pathComponent));
                final java.lang.Object userObject = node.getUserObject();
                return userObject;
            }
        }
    }
    return null;
}