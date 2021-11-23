private void increaseTradeResource(client.domestic.ResourceType resource, model.cards.ResourceCards playerCards) {
    int change = changeAmountOfCards(resource, 1);
    this.tradeOverlay.setResourceAmount(resource, java.lang.Integer.toString(change));
    this.sending = true;
    if (playerCardLimit(resource, playerCards, change)) {
        this.tradeOverlay.setResourceAmountChangeEnabled(resource, false, true);
    }
    sending = true;
    updateEnableTrade();
}