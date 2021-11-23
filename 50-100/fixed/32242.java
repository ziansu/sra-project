public Board getNextMove(Board state) {
    int max = java.lang.Integer.MIN_VALUE;
    Board result = null;
    for (int i = 0; i < (state.getUnfilled()); i++) {
        Board b = generateBoard(state, (i + 1));
        int bVal = findBoardValue(b, 1);
        if (bVal > max) {
            max = bVal;
            result = b;
        }
    }
    java.lang.System.out.println(result);
    return result;
}