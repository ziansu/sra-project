public void cleanup() {
    pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.deleteAllClusters();
    pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.addCluster(this.amorphousVirtualCluster);
}