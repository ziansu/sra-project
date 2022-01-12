public void unsetConnectionServiceInternal(org.opendaylight.ovsdb.plugin.api.OvsdbConnectionService connectionService) {
    if ((this.connectionService) == connectionService) {
        this.connectionService = null;
    }
}