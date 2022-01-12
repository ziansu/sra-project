public int[] keysToArray() {
    int[] keys = new int[size];
    walk(root, new RBTree.IndexedConsumer<RBTree.RBNode>(( node, index) -> keys[(index++)] = node.key));
    return keys;
}