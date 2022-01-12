public static void main(java.lang.String[] args) {
    int N = 3;
    Percolation pc = new Percolation(N);
    Percolation.utest(pc, N, 1, 1);
    Percolation.utest(pc, N, 2, 2);
    Percolation.utest(pc, N, 1, 2);
    Percolation.utest(pc, N, 3, 2);
}