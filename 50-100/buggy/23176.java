@java.lang.Override
protected java.lang.String getStatusText() {
    if ((game) == null) {
        return null;
    }
    java.lang.String str = java.lang.Integer.valueOf(game.currPos().fullMoveCounter).toString();
    str += (game.currPos().whiteMove) ? ". White's move" : "... Black's move";
    if ((game.getGameStatus()) != (Game.Status.ALIVE)) {
        str = game.getGameStateString();
    }
    return str;
}