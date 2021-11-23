private void substituteNode(org.stepik.belousov.BoolExpParsing.TreeNode oldNode, org.stepik.belousov.BoolExpParsing.TreeNode newNode) {
    if ((oldNode.parent) != null) {
        boolean isLeftChild = (oldNode.parent.left) == oldNode;
        if (isLeftChild)
            oldNode.parent.left = newNode;
        else
            oldNode.parent.right = newNode;
        
        newNode.parent = oldNode.parent;
    }else {
        newNode.parent = null;
        root = newNode;
    }
}