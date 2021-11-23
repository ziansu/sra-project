@java.lang.SuppressWarnings(value = "unchecked")
protected boolean isNodeReadable(com.stratelia.webactiv.node.model.NodePK nodePK) {
    nodePK.setComponentName(ticket.getComponentId());
    com.stratelia.webactiv.node.model.NodeDetail node = getNodeBm().getDetail(nodePK);
    com.silverpeas.sharing.security.ShareableNode nodeResource = new com.silverpeas.sharing.security.ShareableNode(token, node);
    return ticket.getAccessControl().isReadable(nodeResource);
}