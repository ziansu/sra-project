public void checkForGoAnywhere() {
    for (UltimateTicTacToe.BigTile big : bigTiles) {
        if (((big.numMarked) == 9) || (((big.winner) != 0) && ((idToPlayOn) == (big.id)))) {
            goAnywhere = true;
        }
    }
}