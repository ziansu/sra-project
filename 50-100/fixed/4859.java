private com.livae.util.tree.Btree<java.lang.Integer> createFullTree(int levels, int nodesPerPage) {
    com.livae.util.tree.Btree<java.lang.Integer> tree = new com.livae.util.tree.Btree(nodesPerPage);
    com.livae.util.Tuple<com.livae.util.tree.BtreePage<java.lang.Integer>, java.lang.Integer> root = createFullTree(tree, levels, nodesPerPage, 1);
    tree.getTestUtils().setRoot(tree, root.first, root.second);
    return tree;
}