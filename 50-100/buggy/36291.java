public java.util.ArrayList<puzzle.PuzzleState> getNeighbors() {
    java.util.ArrayList<puzzle.PuzzleState> neighbors = new java.util.ArrayList<puzzle.PuzzleState>();
    puzzle.PuzzleState neighbor;
    java.lang.System.out.println("getting neighbors.");
    for (java.lang.String act : ACTIONS) {
        if (current.validAction(act)) {
            neighbor = new puzzle.PuzzleState(current.getString());
            neighbor.act(act);
            neighbors.add(neighbor);
        }
    }
    return neighbors;
}