public void inOrderTraverse(datastructure.nonlinear.BinaryTreeNode rootNode) {
    if (rootNode == null) {
        return ;
    }
    inOrderTraverse(rootNode.leftChild);
    java.lang.System.out.println(rootNode.data);
    inOrderTraverse(rootNode.rightChild);
}