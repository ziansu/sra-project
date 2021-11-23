@java.lang.Override
public long getWhiteAttaksBitboard(com.davidbalazs.chess.model.ChessPosition chessPosition) {
    return getAttaksBitboard(chessPosition.getWhiteKnights());
}