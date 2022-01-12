public void removeNode(model.Node parent, model.Node child) {
    parent.getChildren().remove(child);
    for (javax.swing.event.TreeModelListener l : listeners) {
        l.treeNodesRemoved(new javax.swing.event.TreeModelEvent(this, getPathToRoot(parent), new int[]{ getIndexOfChild(parent, child) }, new java.lang.Object[]{ child }));
    }
}