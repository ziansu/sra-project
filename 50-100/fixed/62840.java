public static void main(java.lang.String[] args) {
    Percolation percolation = new Percolation(4);
    percolation.open(1, 1);
    percolation.open(1, 2);
    percolation.open(1, 3);
    percolation.open(1, 4);
    java.lang.System.out.println(percolation.percolates());
}