@java.lang.Override
public boolean addClusterNode(pt.ulisboa.tecnico.amorphous.cluster.ClusterNode node) {
    this.nodes.add(node);
    pt.ulisboa.tecnico.amorphous.cluster.ipv4multicast.ClusterService.logger.debug((((("Node " + (node.getNodeID())) + "(") + (node.getNodeIP())) + ") added!"));
    return this.isClusterNode(node);
}