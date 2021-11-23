public List<java.lang.String[]> solveNQueens(int n) {
    ArrayList<java.lang.String[]> solutions = new ArrayList<java.lang.String[]>();
    int[] rows = new int[n];
    solveNQueens(solutions, rows, 0);
    return solutions;
}