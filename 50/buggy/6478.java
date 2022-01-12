public void postOrderTraversal(Node n) {
    if (n == null) {
        return ;
    }
    inOrderTraversal(n.getLeftChild());
    inOrderTraversal(n.getRightChild());
    java.lang.System.out.println(n.getData());
}