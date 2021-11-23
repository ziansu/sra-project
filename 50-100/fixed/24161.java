public boolean isOpponentThinking() {
    return (((getGame()) != null) && ((getGame().getGameStatus()) == (Game.Status.ALIVE))) && (((getGameMode()) == (org.empyrn.darkknight.GameMode.ANALYSIS)) || (!(isPlayerTurn())));
}