public static boolean checkBinarySearchTree(com.mathume.playground.datastructures.storage.BinaryTree<java.lang.Integer> t) {
    java.util.List<java.lang.Integer> visited = new java.util.ArrayList<java.lang.Integer>();
    try {
        com.mathume.playground.datastructures.storage.BinaryTreeUtils.checkBinarySearchTree(visited, t.getRoot());
        return true;
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
}