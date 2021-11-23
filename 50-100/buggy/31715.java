@javax.websocket.OnError
public void onError(javax.websocket.Session session, java.lang.Throwable throwable, @javax.websocket.server.PathParam(value = "streamname")
java.lang.String streamName, @javax.websocket.server.PathParam(value = "version")
java.lang.String version, @javax.websocket.server.PathParam(value = "tdomain")
java.lang.String tdomain) {
    org.wso2.carbon.context.PrivilegedCarbonContext carbonContext = org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext();
    try {
        carbonContext.startTenantFlow();
        carbonContext.setTenantDomain(tdomain, true);
        super.onError(session, throwable, streamName, version);
    } finally {
        carbonContext.endTenantFlow();
    }
}