public java.util.List<coverage.ObservedTreeNode> getAllLeafNodes() {
    java.util.List<coverage.ObservedTreeNode> leaves = new java.util.ArrayList<>();
    if ((this.children) == null) {
        leaves.add(this);
    }else {
        for (coverage.ObservedTreeNode child : this.children) {
            leaves.addAll(child.getAllLeafNodes());
        }
    }
    return leaves;
}