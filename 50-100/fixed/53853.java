@java.lang.Override
public boolean startClusterService() {
    if (!(this.isClusterServiceRunning())) {
        this.clusterComm.initCommunications();
        try {
            this.clusterComm.sendMessage(new pt.ulisboa.tecnico.amorphous.internal.cluster.messages.JoinCluster(this.NodeId, true));
        } catch (pt.ulisboa.tecnico.amorphous.internal.cluster.messages.InvalidAmorphClusterMessageException e) {
            pt.ulisboa.tecnico.amorphous.internal.cluster.ClusterService.logger.error(e.getMessage());
            this.clusterComm.stopCommunications();
            return false;
        }
    }
    return this.isClusterServiceRunning();
}