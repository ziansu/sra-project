private long generatePossibleMovesBitboardToDownRight(int i, long occupiedBitboard, long opponentBitboard) {
    long possibleMovesToDownRight = (com.davidbalazs.chess.constants.BitboardConstants.diagonalSlidingDownRight[i]) & occupiedBitboard;
    possibleMovesToDownRight = (((((possibleMovesToDownRight >> 7) | (possibleMovesToDownRight >> 14)) | (possibleMovesToDownRight >> 21)) | (possibleMovesToDownRight >> 28)) | (possibleMovesToDownRight >> 35)) | (possibleMovesToDownRight >> 42);
    return getBitboardFromNumber(possibleMovesToDownRight, com.davidbalazs.chess.constants.BitboardConstants.diagonalSlidingDownRight[i], opponentBitboard, occupiedBitboard);
}