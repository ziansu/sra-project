@java.lang.Override
public java.lang.Void call() {
    boolean whitePlayer = false;
    if (((currentGame.getTurnCount()) % 2) == 0) {
        whitePlayer = true;
    }
    boolean success = currentGame.getBoard().makeMove(whitePlayer, start, end, arrow);
    if (success == true) {
        currentGame.setTurnCount(((currentGame.getTurnCount()) + 1));
        java.lang.System.out.println(currentGame.getBoard().toString());
    }
    return null;
}