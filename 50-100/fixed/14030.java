public final void init(mage.view.PlayerView player, mage.client.cards.BigCard bigCard, java.util.UUID gameId, int priorityTime) {
    this.playerPanel.init(gameId, player.getPlayerId(), bigCard, priorityTime);
    this.battlefieldPanel.init(gameId, bigCard);
    this.gameId = gameId;
    this.playerId = player.getPlayerId();
    if (mage.client.MageFrame.getSession().isTestMode()) {
        this.btnCheat.setVisible(true);
    }else {
        this.btnCheat.setVisible(false);
    }
}