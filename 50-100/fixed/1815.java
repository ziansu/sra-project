public java.lang.String getPath() {
    final java.lang.StringBuilder path = new java.lang.StringBuilder();
    com.unnamed.b.atv.model.TreeNode node = this;
    while ((node.mParent) != null) {
        path.append(node.getId());
        node = node.mParent;
        if ((node.mParent) != null) {
            path.append(com.unnamed.b.atv.model.TreeNode.NODES_ID_SEPARATOR);
        }
    } 
    return path.toString();
}