private com.emc.storageos.db.client.model.Network getNetworkByNativeId(java.util.List<com.emc.storageos.db.client.model.Network> networks, java.lang.String fabricId) {
    for (com.emc.storageos.db.client.model.Network network : networks) {
        if (network.getNativeId().equals(fabricId)) {
            return network;
        }
    }
    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("The given fabricId '{0}' cannot be found.", fabricId));
}