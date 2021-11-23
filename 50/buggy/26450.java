public org.ow2.proactive.resourcemanager.rmnode.RMDeployingNode getDeployingNode(java.lang.String nodeUrl) {
    org.ow2.proactive.resourcemanager.rmnode.RMDeployingNode deployingNode = deployingNodes.get(nodeUrl);
    if (deployingNode == null) {
        return lostNodes.get(nodeUrl);
    }
    return deployingNode;
}