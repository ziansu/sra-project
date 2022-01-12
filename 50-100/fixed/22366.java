protected int height(datastructure.binarysearchtree.BinarySearchTree.Node root) {
    if ((root == null) || (((root.getLeft()) == null) && ((root.getRight()) == null))) {
        return 0;
    }else {
        int left;
        int right;
        left = height(root.getLeft());
        right = height(root.getRight());
        return 1 + (left > right ? left : right);
    }
}