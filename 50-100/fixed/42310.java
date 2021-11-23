@java.lang.Override
protected boolean isNodeReadable(com.stratelia.webactiv.node.model.NodePK nodePK) {
    nodePK.setComponentName(getComponentId());
    com.stratelia.webactiv.node.model.NodeDetail node = super.getNodeBm().getDetail(nodePK);
    com.silverpeas.sharing.security.ShareableNode nodeResource = new com.silverpeas.sharing.security.ShareableNode(token, node);
    return this.ticket.getAccessControl().isReadable(nodeResource);
}