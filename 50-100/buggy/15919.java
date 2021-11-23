public java.lang.String getMove() {
    int max = 0;
    java.lang.String move = INCOME;
    for (int i = 0; i < (possibleMoves); i++) {
        if (max < (utility[i]))
            max = utility[i];
        
        java.lang.System.out.println(utility[i]);
    }
    for (int i = 0; i < (possibleMoves); i++) {
        if (max == (utility[i]))
            return moves[i];
        
    }
    return move;
}