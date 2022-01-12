private void initFromModel() {
    client.data.PlayerInfo localPlayer = client.clientFacade.ClientFacade.getInstance().getUserData();
    getView().setLocalPlayerColor(localPlayer.getColor());
}