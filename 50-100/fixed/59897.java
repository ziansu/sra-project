private void sweep() {
    for (int clusterId = 0; clusterId < (clusters.size()); clusterId++) {
        softsat.inference.MCSat mcsat = new softsat.inference.MCSat(clusterId, clusters.get(clusterId));
        mcsat.sample(0);
    }
}