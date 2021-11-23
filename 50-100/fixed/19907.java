protected org.silverpeas.node.web.NodeEntity getNode(java.lang.String path) {
    java.lang.String nodeId = getNodeIdFromURI(path);
    if (nodeId.equals(NodePK.ROOT_NODE_ID)) {
        return getRoot();
    }else {
        com.stratelia.webactiv.node.model.NodeDetail node = getNodeDetail(nodeId);
        if (!(isNodeReadable(node))) {
            throw new javax.ws.rs.WebApplicationException(javax.ws.rs.core.Response.Status.UNAUTHORIZED);
        }
        java.net.URI uri = super.getUriInfo().getRequestUri();
        return org.silverpeas.node.web.NodeEntity.fromNodeDetail(node, uri);
    }
}