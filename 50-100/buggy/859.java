@org.junit.Test
public void isEmpty() throws java.lang.Exception {
    AvlTree<java.lang.Integer> avlTree = new AvlTree();
    org.junit.Assert.assertFalse("Test for 'isEmpty()' failed: not empty", (!(avlTree.isEmpty())));
    avlTree.add(5);
    org.junit.Assert.assertFalse("Test for 'isEmpty()' failed: empty", avlTree.isEmpty());
    avlTree.remove(5);
    org.junit.Assert.assertFalse("Test for 'isEmpty()' failed: not empty after remove", (!(avlTree.isEmpty())));
}