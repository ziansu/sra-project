public void makeMove(Move moveToPlay) {
    if (validMove(moveToPlay)) {
        boardRepresentation[moveToPlay.getColPosition()][findFirstEmptySlot(moveToPlay)] = moveToPlay.getMoveColor();
    }
}