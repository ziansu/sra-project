private int runPercolation(int n) {
    Percolation percolation = new Percolation(n);
    int blocksOpen = 0;
    while (!(percolation.percolates())) {
        java.lang.System.out.println(blocksOpen);
        int row = edu.princeton.cs.algs4.StdRandom.uniform(1, (n + 1));
        int col = edu.princeton.cs.algs4.StdRandom.uniform(1, (n + 1));
        percolation.open(row, col);
        blocksOpen++;
    } 
    java.lang.System.out.println(blocksOpen);
    return blocksOpen;
}