public java.lang.String[] valuesToArray() {
    java.lang.String[] items = new java.lang.String[size];
    walk(root, new RBTree.IndexedConsumer<RBTree.RBNode>(( node, index) -> items[(index++)] = node.item));
    return items;
}