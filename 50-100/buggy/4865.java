public static com.emajar.trees.Node createBalancedTree(int[] array, int min, int max) {
    if (max < min) {
        return null;
    }
    int middle = (max - min) / 2;
    com.emajar.trees.Node n = new com.emajar.trees.Node(array[middle]);
    n.left = com.emajar.trees.CreateBalancedTree.createBalancedTree(array, 0, (middle - 1));
    n.right = com.emajar.trees.CreateBalancedTree.createBalancedTree(array, (middle + 1), max);
    return null;
}