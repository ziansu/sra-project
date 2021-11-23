public interfaces.State getBestNeighbor() {
    java.util.ArrayList<puzzle.PuzzleState> neighbors = getNeighbors();
    puzzle.PuzzleState topval = neighbors.get(0);
    for (puzzle.PuzzleState state : neighbors) {
        if ((state.getValue()) < (topval.getValue())) {
            topval = state;
        }
    }
    java.lang.System.out.println(("Best Neighbor: " + (topval.getString())));
    return topval;
}