private common.ServerInfo getDestinationServerInfo(java.lang.String key) {
    common.ServerInfo destinationServer = null;
    common.Hasher hasher = new common.Hasher();
    if ((metadata.size()) != 0) {
        for (common.ServerInfo server : metadata) {
            if (hasher.isInRange(server.getFromIndex(), server.getToIndex(), hasher.getHash(key))) {
                return server;
            }
        }
    }else {
        destinationServer = this.currentDestinationServer;
        logger.info("metadata is empty !!");
    }
    return destinationServer;
}