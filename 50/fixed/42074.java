protected java.util.Set<java.lang.String> getMessagePublishedNodes() throws org.wso2.andes.kernel.AndesException {
    java.util.Set<java.lang.String> publishedNodes;
    publishedNodes = slotAgent.getMessagePublishedNodes();
    return publishedNodes;
}