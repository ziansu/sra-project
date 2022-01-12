public void tree_pruning(TreeNode node) {
    if ((node == null) || ((node.children) == null))
        return ;
    
    for (TreeNode tempNode : node.children)
        tree_pruning(tempNode);
    
    if (((node.children.size()) == 0) && ((node.tag) == false)) {
        TreeNode parent = this.getNodeUsingUid(node.parentUid);
        parent.removeChild(node);
        return ;
    }
    return ;
}