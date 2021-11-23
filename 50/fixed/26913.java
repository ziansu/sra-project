@java.lang.Override
protected boolean isNodeReadable(com.stratelia.webactiv.node.model.NodePK nodePK) {
    return nodeAccessController.isUserAuthorized(super.getUserDetail().getId(), nodePK);
}