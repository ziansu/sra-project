public static void main(java.lang.String[] args) {
    answers.cc150.chapter04.BinarySearchTree bst = new answers.cc150.chapter04.BinarySearchTree();
    bst.add(5);
    bst.add(3);
    bst.add(15);
    bst.add(10);
    bst.add(17);
    bst.printTree(EnumTraverseMethods.DFS_PRE_ORDER);
    bst.printTree(EnumTraverseMethods.DFS_IN_ORDER);
    bst.printTree(EnumTraverseMethods.DFS_POST_ORDER);
}