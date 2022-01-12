private xl.playground.algo.tree.BinarySearchTree.Node<Item> addNode(xl.playground.algo.tree.BinarySearchTree.Node<Item> root, Item value) {
    if (root == null) {
        return new xl.playground.algo.tree.BinarySearchTree.Node<>(value);
    }
    if ((root.value.compareTo(value)) >= 0) {
        root.left = addNode(root.left, value);
    }else {
        root.right = addNode(root.right, value);
    }
    root.count = 1 + (countChildren(root));
    return root;
}