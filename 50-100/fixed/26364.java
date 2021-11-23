public void repopulate(java.util.Collection<edu.buffalo.cse.sneps3.gui.business.Context> c) {
    rootNode = new javax.swing.tree.DefaultMutableTreeNode("Contexts");
    treeModel = new javax.swing.tree.DefaultTreeModel(rootNode);
    for (edu.buffalo.cse.sneps3.gui.business.Context ct : c) {
        if (ct.getParents().isEmpty()) {
            edu.buffalo.cse.sneps3.gui.ComparableTreeNode t = new edu.buffalo.cse.sneps3.gui.ComparableTreeNode(ct);
            rootNode.add(t);
            populateChildrenOf(t, c);
        }
    }
    jTree_contexts.setModel(treeModel);
    expandAll(jTree_contexts);
}