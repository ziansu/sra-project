@java.lang.Override
public void setPlayerToTradeWith(int playerIndex) {
    if (playerIndex > (-1)) {
        trade.setReceiverNumber(new model.player.PlayerIdx(playerIndex));
        personToAsk = true;
        updateEnableTrade();
    }
}