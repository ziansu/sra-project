private int[] blockEdges(Graph strongComponent, int vertex, int[] state) {
    for (int neighbour : strongComponent.getNeighbours(vertex)) {
        assert (state[neighbour]) > 0;
        (state[neighbour])--;
    }
    return state;
}