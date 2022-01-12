public void refresh() {
    java.lang.System.out.println("Refreshing...");
    refreshProjectList();
    javax.swing.tree.DefaultMutableTreeNode root = ((javax.swing.tree.DefaultMutableTreeNode) (((javax.swing.tree.DefaultTreeModel) (getModel())).getRoot()));
    for (int i = 0; i < (root.getChildCount()); i++) {
        reloadProjectFiles(((shared.FileTree.ProjectNode) (root.getChildAt(i))));
    }
}