@java.lang.Override
public void displaySolution(java.lang.String name) {
    algorithms.search.Solution<algorithms.mazeGenerators.Position> sol = this.solutionDB.getSolution(name);
    c.passForDisplay(sol.toString());
}