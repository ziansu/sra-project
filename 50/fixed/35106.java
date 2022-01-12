public boolean removeInboundEndpoint(java.lang.String name) throws java.lang.Exception {
    try {
        stub.removeInboundEndpoint(name);
        return true;
    } catch (java.lang.Exception e) {
        org.wso2.carbon.inbound.ui.internal.InboundManagementClient.log.error(e);
        return false;
    }
}