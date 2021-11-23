public int generateValuesArray(data_structures.RBTree.RBNode root, java.lang.String[] arr, int index) {
    if ((-1) == (root.key)) {
        return index;
    }
    index = generateValuesArray(root.left, arr, index);
    arr[index] = root.value;
    index++;
    index = generateValuesArray(root.right, arr, index);
    return index;
}