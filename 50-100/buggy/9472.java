private java.lang.String getAdapterQueryLogUnsecuredSerrviceUrl() {
    java.lang.String url = null;
    try {
        url = proxyHelper.getUrlLocalHomeCommunity(NhincConstants.ADAPTER_AUDIT_QUERY_LOG_SERVICE_NAME);
    } catch (gov.hhs.fha.nhinc.connectmgr.ConnectionManagerException ex) {
        gov.hhs.fha.nhinc.auditquerylog.nhinc.proxy.AuditQueryLogProxyWebServiceUnsecuredImpl.LOG.debug((("Error while retrieving url for " + (gov.hhs.fha.nhinc.nhinclib.NhincConstants.ADAPTER_AUDIT_QUERY_LOG_SERVICE_NAME)) + (ex.getLocalizedMessage())), ex);
        return url;
    } catch (java.lang.Exception ex) {
        gov.hhs.fha.nhinc.auditquerylog.nhinc.proxy.AuditQueryLogProxyWebServiceUnsecuredImpl.LOG.debug((("Failed to call the web service " + (gov.hhs.fha.nhinc.nhinclib.NhincConstants.ADAPTER_AUDIT_QUERY_LOG_SERVICE_NAME)) + (ex.getLocalizedMessage())), ex);
    }
    return url;
}