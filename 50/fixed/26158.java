private void disconnectNodes(BooleanTree.Node parent, BooleanTree.Node child) {
    while (child.parents.contains(parent)) {
        child.parents.remove(parent);
    } 
    while (parent.children.contains(child)) {
        parent.children.remove(child);
    } 
}