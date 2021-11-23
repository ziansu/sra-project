public void printTree(int s) {
    java.lang.System.out.println(("root is: " + s));
    DiGraph.TreeNode root = buildTree((s - 1));
    recurPrint(root, 1);
}