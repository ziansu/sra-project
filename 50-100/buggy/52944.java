public void onWinner(java.lang.String ownerId, java.lang.String winner) {
    if (cwa115.trongame.Game.GameSettings.getPlayerId().equals(ownerId))
        return ;
    
    if ((cwa115.trongame.Game.GameSettings.getOwner()) == (java.lang.Integer.valueOf(ownerId)))
        gameActivity.setWinner(winner);
    
    gameActivity.onEndGame();
}