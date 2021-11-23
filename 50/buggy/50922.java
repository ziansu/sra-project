public void setClusterInterface(org.apache.falcon.entity.v0.cluster.Interfacetype interfacetype, java.lang.String value) {
    org.apache.falcon.regression.Entities.ClusterMerlin c = getClusterElement();
    c.setInterface(interfacetype, value);
    writeClusterElement(c);
}