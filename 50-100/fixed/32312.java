private void decreaseTradeResource(client.domestic.ResourceType resource) {
    int change = changeAmountOfCards(resource, (-1));
    this.tradeOverlay.setResourceAmount(resource, java.lang.Integer.toString(change));
    this.tradeOverlay.setResourceAmountChangeEnabled(resource, true, true);
    if (change == 0) {
        this.tradeOverlay.setResourceAmountChangeEnabled(resource, true, false);
        this.sending = false;
    }
}