public common.constants.GameStatus getState() {
    if (!(isGameOver())) {
        return common.constants.GameStatus.RUNNING;
    }
    if (isStalemate()) {
        return common.constants.GameStatus.STALEMATE;
    }
    utilties.models.Game.LOGGER.warning("Cannot determine which player has won easily from the getState() method. Needs helper methods.");
    if (isDead(0)) {
        java.lang.System.out.println("We got a winner");
        return common.constants.GameStatus.LOST;
    }else
        if (isDead(1)) {
            java.lang.System.out.println("We got a loser");
            return common.constants.GameStatus.WON;
        }
    
    throw new java.lang.RuntimeException("CANNOT DETERMINE GAME STATE.");
}