private int[] blockEdges(Graph strongComponent, int vertex, int[] state) {
    int[] nextState = java.util.Arrays.copyOf(state, state.length);
    for (int neighbour : strongComponent.getNeighbours(vertex)) {
        assert (nextState[neighbour]) > 0;
        (nextState[neighbour])--;
    }
    return nextState;
}