private static gtd.stack.AbstractStackNode[] generateChildren(gtd.stack.AbstractStackNode[] nodes) {
    gtd.stack.AbstractStackNode[] children = new gtd.stack.AbstractStackNode[nodes.length];
    children[0] = nodes[0];
    for (int i = 1; i < (children.length); ++i) {
        children[i] = nodes[i];
        children[(i - 1)].addNext(children[i]);
    }
    return children;
}