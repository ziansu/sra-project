public java.util.List<edu.utdallas.whoosh.api.INode> getNodesFromGroup(edu.utdallas.whoosh.api.INodeGroup group) {
    return getNodes(edu.utdallas.woosh.appservices.NodeManager.nodeGroups.get(group));
}