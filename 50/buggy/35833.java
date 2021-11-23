private void heightTest1(algo.data.structures.BinarySearchTree<java.lang.Integer> bs) {
    for (int i = 1; i <= 10; ++i) {
        bs.add(i);
    }
    assertEquals(9, bs.height());
}