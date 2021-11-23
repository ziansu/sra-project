public int modeRandom(GameState currState) {
    java.util.Random rand = new java.util.Random();
    int nextMove = rand.nextInt(7);
    while (!(currState.isValidMove(nextMove))) {
        nextMove = rand.nextInt(7);
    } 
    return nextMove;
}