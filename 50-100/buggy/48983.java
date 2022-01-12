public int generateKeysArray(data_structures.RBTree.RBNode root, int[] arr, int index) {
    if (null == root) {
        return index;
    }
    index = generateKeysArray(root.left, arr, index);
    arr[(index++)] = root.key;
    index = generateKeysArray(root.right, arr, index);
    return index;
}