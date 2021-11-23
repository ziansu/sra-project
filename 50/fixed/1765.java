public int calculateBestMove() {
    nl.hanze2017e4.gameclient.model.games.reversi.ReversiMove move = determineScore(legalMoves);
    java.lang.System.out.println("calculateBestMove invoked");
    return move.getMove();
}