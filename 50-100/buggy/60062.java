@java.lang.Override
public void playMonopolyCard(shared.definitions.ResourceType resource) {
    client.managers.GameManager gm = client.communication.ClientCommunicator.getSingleton().getGameManager();
    java.lang.Integer playerId = client.communication.ClientCommunicator.getSingleton().getPlayerId();
    client.proxy.Monopoly m = new client.proxy.Monopoly(gm.getPlayerIndex(playerId));
    m.setResource(resource);
    try {
        client.communication.ClientCommunicatorFascadeSettlersOfCatan.getSingleton().monopoly(m);
        gm.useMonopoly(resource);
        getPlayCardView().closeModal();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}