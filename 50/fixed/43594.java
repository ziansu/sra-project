public void testPercolationSystemSizeOne() {
    Percolation percolation;
    percolation = new Percolation(1);
    assertFalse(percolation.percolates());
    percolation.open(1, 1);
    assertTrue(percolation.percolates());
}