public com.netflix.dyno.connectionpool.TokenPoolTopology getTokenPoolTopology() {
    com.netflix.dyno.connectionpool.TokenPoolTopology topology = new com.netflix.dyno.connectionpool.TokenPoolTopology(replicationFactor.get());
    if ((localRack) != null) {
        addTokens(topology, localRack, localSelector);
        for (java.lang.String remoteRack : remoteDCSelectors.keySet()) {
            addTokens(topology, remoteRack, remoteDCSelectors.get(remoteRack));
        }
    }
    return topology;
}