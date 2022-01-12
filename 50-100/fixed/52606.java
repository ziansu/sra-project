public amara.engine.applications.masterserver.client.appstates.PlayerStatus getPlayerStatus(int playerID) {
    updatingStatuses.add(playerID);
    amara.engine.network.NetworkClient networkClient = getAppState(amara.engine.applications.masterserver.client.appstates.NetworkClientHeadlessAppState.class).getNetworkClient();
    networkClient.sendMessage(new amara.engine.applications.masterserver.client.appstates.Message_GetPlayerStatus(playerID));
    while (true) {
        if (!(updatingStatuses.contains(playerID))) {
            return statuses.get(playerID);
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception ex) {
        }
    } 
}