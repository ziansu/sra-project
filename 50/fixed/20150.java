@java.lang.Override
public void onEvent(com.google.gson.JsonElement data) {
    it.simonedegiacomi.goboxapi.client.StandardGBClient.log.info("websocket error");
    if (((state) == (ClientState.READY)) && ((disconnectedListener) != null)) {
        disconnectedListener.onDisconnect();
    }
    state = ClientState.NOT_READY;
}