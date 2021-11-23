@java.lang.SuppressWarnings(value = "unused")
private programming.challenges.BinaryTree.Node createBST() {
    programming.challenges.BinaryTree.Node root = null;
    int[] bstArray = new int[]{ 12 , 4 , 7 , 5 , 3 , 18 , 20 , 42 , 1 , 19 , 6 };
    for (int i = 0; i < (bstArray.length); i++) {
        root = insertNodeIntoBST(root, bstArray[i]);
    }
    java.lang.System.out.println(("createBST().root: " + (root.data)));
    return root;
}