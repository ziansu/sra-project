public void registerPacManPlayer(nl.tudelft.jpacman.level.Player p) {
    registerPlayer(p, startPacManSquares, startPacManSquareIndex);
    (startPacManSquareIndex)++;
    startPacManSquareIndex %= startPacManSquares.size();
}