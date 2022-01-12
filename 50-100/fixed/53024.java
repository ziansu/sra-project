@java.lang.Override
public void sendTradeOffer() {
    if (getTradeOverlay().isModalShowing()) {
        getTradeOverlay().closeModal();
    }
    if (!(getWaitOverlay().isModalShowing())) {
        getWaitOverlay().showModal();
    }
    int curPlayerIndex = client.session.SessionManager.instance().getPlayerIndex();
    shared.communication.moves.OfferTrade_Input newTradeOffer = new shared.communication.moves.OfferTrade_Input(curPlayerIndex, curOffer, curPlayerToTradeTo);
    client.session.SessionManager.instance().getClientFacade().offerTrade(newTradeOffer);
}