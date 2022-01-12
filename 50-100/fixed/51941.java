private com.emc.storageos.db.client.model.Network getNetworkByNativeId(java.util.List<com.emc.storageos.db.client.model.Network> networks, java.lang.String fabricId) {
    for (com.emc.storageos.db.client.model.Network network : networks) {
        if (((network != null) && ((network.getNativeId()) != null)) && (network.getNativeId().equals(fabricId))) {
            return network;
        }
    }
    return null;
}