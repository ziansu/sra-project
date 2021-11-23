private Position positionType(int loc) {
    int[] arrLoc = intMoveToArrMove(loc);
    return boardPositions[arrLoc[0]][arrLoc[1]];
}