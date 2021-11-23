@java.lang.Override
public void onMessageReceived(java.lang.String endpointID, byte[] payload, boolean isReliable) {
    java.lang.String message = new java.lang.String(payload);
    if (!(m_IsHost)) {
        java.lang.String[] aIds = message.split(" ");
        for (java.lang.String ids : aIds) {
            java.lang.String[] aId = ids.split(":");
            appsolutegamesgmbh.schnaps2gether.GUI.Lobby.endpointIds.add(aId[0]);
            appsolutegamesgmbh.schnaps2gether.GUI.Lobby.deviceIds.add(aId[1]);
        }
    }
}