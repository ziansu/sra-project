public void run(java.io.InputStreamReader input, java.io.PrintStream output) throws java.io.IOException {
    uk.nickbdyer.datastructures.tree_height.TreeHeight tree = new uk.nickbdyer.datastructures.tree_height.TreeHeight();
    tree.read(input);
    output.println(tree.computeHeight());
}