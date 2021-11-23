private void dbListTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {
    javax.swing.tree.TreePath path = evt.getPath();
    javax.swing.tree.DefaultMutableTreeNode node = ((javax.swing.tree.DefaultMutableTreeNode) (path.getLastPathComponent()));
    java.lang.System.out.println((("节点" + node) + "被展开"));
}