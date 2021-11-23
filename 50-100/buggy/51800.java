@java.lang.Override
public void removeLBOutboundEndpoint(org.wso2.carbon.gateway.httploadbalancer.outbound.LBOutboundEndpoint lbOutboundEndpoint) {
    synchronized(this.lock) {
        if (this.lbOutboundEndpoints.contains(lbOutboundEndpoint)) {
            this.lbOutboundEndpoints.remove(lbOutboundEndpoint);
            java.lang.String hostAndPort = org.wso2.carbon.gateway.httploadbalancer.utils.CommonUtil.getHostAndPort(lbOutboundEndpoint.getOutboundEndpoint().getUri());
            map.remove(hostAndPort);
            this.hash.removeEndpoint(lbOutboundEndpoint.getName());
        }else {
            org.wso2.carbon.gateway.httploadbalancer.algorithm.simple.StrictClientIPHashing.log.info(((lbOutboundEndpoint.getName()) + " has already been removed from list.."));
        }
    }
}