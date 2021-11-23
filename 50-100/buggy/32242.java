public Board getNextMove(Board state) {
    int max = java.lang.Integer.MIN_VALUE;
    Board result;
    for (int i = 0; i < (state.getUnfilled()); i++) {
        Board b = generateBoard(state, i);
        int bVal = findBoardValue(b, 1);
        if (bVal > max) {
            max = bVal;
            result = b;
        }
    }
    return state;
}