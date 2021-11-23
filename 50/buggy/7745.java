public final boolean isPlayerTurn(boolean whiteMove) {
    return (whiteMove ? playerWhite() : playerBlack()) || ((this) == (org.empyrn.darkknight.GameMode.ANALYSIS));
}