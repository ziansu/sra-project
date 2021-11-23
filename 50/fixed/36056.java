public void postOrderTraverse(datastructure.nonlinear.BinaryTreeNode rootNode) {
    if (rootNode == null) {
        return ;
    }
    postOrderTraverse(rootNode.leftChild);
    postOrderTraverse(rootNode.rightChild);
    java.lang.System.out.println(rootNode.data);
}