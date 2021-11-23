private int runPercolation(int n) {
    Percolation percolation = new Percolation(n);
    int blocksOpen = 0;
    while (!(percolation.percolates())) {
        int row = edu.princeton.cs.algs4.StdRandom.uniform(1, n);
        int col = edu.princeton.cs.algs4.StdRandom.uniform(1, n);
        percolation.open(row, col);
        blocksOpen++;
    } 
    java.lang.System.out.println(blocksOpen);
    return blocksOpen;
}