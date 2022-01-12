public static double leastOpponentMoves(hus.HusBoardState board, int player_id) {
    double ret = 0;
    int[][] pits = board.getPits();
    int[] opponent_pits = pits[(1 - player_id)];
    for (int i : opponent_pits) {
        if (i > 1)
            ret++;
        
    }
    return ret;
}