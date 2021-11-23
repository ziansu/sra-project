private void printNode(com.github.gumtreediff.tree.ITree node, com.github.gumtreediff.tree.TreeContext treeContext, java.lang.String filename) {
    java.lang.System.out.printf("node value: %s, type:%s, line: %d, size: %d \n", getValue(node, filename), getType(node, treeContext), getLineNumber(node, filename, true), node.getSize());
}