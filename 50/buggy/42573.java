private void initFromModel() {
    try {
        client.data.PlayerInfo localPlayer = client.clientFacade.ClientFacade.getInstance().getUserData();
        getView().setLocalPlayerColor(localPlayer.getColor());
    } catch (java.lang.Exception e) {
    }
}