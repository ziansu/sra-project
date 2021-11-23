public void solve() {
    Grid previousGrid = solvedGrid;
    while (!(solvedGrid.isSolved())) {
        solveIterative();
        if (previousGrid == (solvedGrid)) {
            java.lang.System.out.println("A little hard to solve?");
            return ;
        }
    } 
}