public int calcPossibleMoves(oot.game.Token token) {
    int possibleMoves = 0;
    int[][] fieldStrength = calcFields(token);
    for (int row = 0; row < (fieldSize); row++) {
        for (int column = 0; column < (fieldSize); column++) {
            if ((fieldStrength[column][row]) != 0)
                possibleMoves++;
            
        }
    }
    return possibleMoves;
}