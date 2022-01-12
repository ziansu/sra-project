@javax.websocket.OnClose
public void onClose(javax.websocket.Session session, javax.websocket.CloseReason reason, @javax.websocket.server.PathParam(value = "streamname")
java.lang.String streamName, @javax.websocket.server.PathParam(value = "version")
java.lang.String version, @javax.websocket.server.PathParam(value = "tdomain")
java.lang.String tdomain) {
    try {
        org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().startTenantFlow();
        org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().setTenantDomain(tdomain, true);
        super.onClose(session, reason, streamName, version);
    } finally {
        org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().endTenantFlow();
    }
}