public void flushTicketsInFile(java.lang.String fileName) {
    javax.swing.tree.DefaultTreeModel defaultModel = ((javax.swing.tree.DefaultTreeModel) (taskTree.getModel()));
    if ((fileToNodes.get(fileName)) != null) {
        for (javax.swing.tree.DefaultMutableTreeNode node : fileToNodes.get(fileName)) {
            java.lang.System.out.println(((uk.ac.glasgow.microissues.plugin.Ticket) (node.getUserObject())).getSummary());
            defaultModel.removeNodeFromParent(node);
            fileToNodes.get(fileName).remove(node);
        }
    }
}