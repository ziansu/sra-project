public final boolean isOpponentThinking() {
    if ((getGame()) == null) {
        throw new java.lang.IllegalStateException();
    }
    return ((getGame().getGameStatus()) == (Game.Status.ALIVE)) && (((getGameMode()) == (org.empyrn.darkknight.GameMode.ANALYSIS)) || (!(isPlayerTurn())));
}