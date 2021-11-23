public int getBestMove(int depth) {
    Map[] moves = getPossibleMoves();
    int max = -1;
    int move = -1;
    for (Map map : moves) {
        if (map != null) {
            int value = map.getValue(depth);
            if (value > max) {
                max = value;
                move = map.moveToGetHere;
            }
        }else {
            java.lang.System.out.println("REEEEE!");
        }
    }
    if (max == 0) {
        move = 3;
    }
    return move;
}