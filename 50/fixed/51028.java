public void makeMove(Move moveToPlay) {
    if (validMove(moveToPlay)) {
        boardRepresentation[findFirstEmptySlot(moveToPlay)][moveToPlay.getColPosition()] = moveToPlay.getMoveColor();
    }
}