public void addStandardTree(tree.Node parent, int depth) {
    tree.Node newNode = new tree.Node(parent);
    addTree(newNode, (depth - 1));
}