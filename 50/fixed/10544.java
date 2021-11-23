public void closeTradeOverlay() {
    tradeOverlayVisible = false;
    engine.removeTrade(currentTrade);
}