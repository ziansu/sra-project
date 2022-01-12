private java.util.ArrayList<remarema.domain.Network> mapNetworkDetailToNetwork(java.util.ArrayList<remarema.api.NetworkDetail> results) {
    java.util.ArrayList<remarema.domain.Network> networkList = new java.util.ArrayList<remarema.domain.Network>();
    for (remarema.api.NetworkDetail result : results) {
        remarema.domain.Network network = new remarema.domain.Network();
        network.setNetworkID(result.getNetworkID());
        remarema.domain.Network networkCheck = em.find(remarema.domain.Network.class, network.getNetworkID());
        networkList.add(networkCheck);
    }
    return networkList;
}