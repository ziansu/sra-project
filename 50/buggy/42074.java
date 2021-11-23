protected java.util.Set<java.lang.String> getMessagePublishedNodes() {
    java.util.Set<java.lang.String> publishedNodes = null;
    try {
        publishedNodes = slotAgent.getMessagePublishedNodes();
    } catch (org.wso2.andes.kernel.AndesException e) {
        org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.error("Failed to get message published nodes from database", e);
    }
    return publishedNodes;
}