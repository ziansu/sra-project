public boolean occupySpace(int pos, char player) throws engine.LocalBoardAlreadyWonException, engine.LocalBoardSpaceAlreadyOccupiedException {
    if (hasWon) {
        throw new engine.LocalBoardAlreadyWonException(player, boardNumber);
    }
    if ((spaces[pos]) != (EngineValues.EMPTY)) {
        throw new engine.LocalBoardSpaceAlreadyOccupiedException(pos, player, boardNumber);
    }
    spaces[pos] = player;
    if (hasRow()) {
        declareWinner(player);
        return true;
    }
    return false;
}