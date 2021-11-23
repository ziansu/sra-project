private com.github.com.ricardobaumann.jankenpon.Player.MOVE getMove(int index) {
    com.github.com.ricardobaumann.jankenpon.Player.MOVE[] moves = com.github.com.ricardobaumann.jankenpon.Player.MOVE.values();
    int movesAmount = moves.length;
    int moveIndex = (index > movesAmount) ? index / movesAmount : index;
    return moves[(moveIndex > movesAmount ? 0 : moveIndex - 1)];
}