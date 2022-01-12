private java.util.ArrayList<remarema.domain.Network> mapNetworkDetailToNetwork(java.util.ArrayList<remarema.api.NetworkDetail> results) {
    java.util.ArrayList<remarema.domain.Network> networkList = new java.util.ArrayList<remarema.domain.Network>();
    for (remarema.api.NetworkDetail result : results) {
        remarema.domain.Network network = em.find(remarema.domain.Network.class, result.getNetworkID());
        if (network != null) {
            networkList.add(network);
        }
    }
    return networkList;
}