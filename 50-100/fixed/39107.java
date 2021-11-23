public Action alphaBetaSearch(State state) {
    depth = 0;
    nodes = 0;
    state = getAvailableMoves(state.getBoardSquares(), 2);
    int v = maxValue(state, java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE);
    state = states.get(state.getBoardSquares());
    states.clear();
    return state.getActionWithValue(v);
}