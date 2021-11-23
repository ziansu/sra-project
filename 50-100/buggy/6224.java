@java.lang.Override
public void setContainerCluster(net.echinopsii.ariane.community.core.mapping.ds.domain.Cluster cluster) {
    if (((this.containerCluster) == null) || (!(this.containerCluster.equals(cluster)))) {
        if (cluster instanceof net.echinopsii.ariane.community.core.mapping.ds.blueprintsimpl.domain.ClusterImpl) {
            this.containerCluster = ((net.echinopsii.ariane.community.core.mapping.ds.blueprintsimpl.domain.ClusterImpl) (cluster));
            synchronizeClusterToDB();
        }
    }
}