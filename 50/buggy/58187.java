public void inOrderTraverse(datastructure.nonlinear.BinaryTreeNode rootNode) {
    if (rootNode == null) {
        return ;
    }
    preOrderTraverse(rootNode.leftChild);
    java.lang.System.out.println(rootNode.data);
    preOrderTraverse(rootNode.rightChild);
}