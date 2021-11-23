@org.junit.Test
public void treeWith10kEntriesIsValid() throws RedBlackTreeTest.TreePropertyException {
    RedBlackTree<java.lang.Integer> tree = new RedBlackTree<java.lang.Integer>();
    java.util.Random random = new java.util.Random();
    for (int i = 1; i <= 10000; i++) {
        tree.insert(((random.nextInt(10000)) - 5000));
    }
    verifyTree(tree);
}