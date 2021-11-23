public Action alphaBetaSearch(State state) {
    state = getAvailableMoves(state.getBoardSquares(), 2);
    int v = maxValue(state, java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE);
    state = states.get(state.getBoardSquares());
    states.clear();
    depth = 0;
    return state.getActionWithValue(v);
}