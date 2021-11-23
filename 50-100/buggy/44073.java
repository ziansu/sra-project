@java.lang.Override
public gov.hhs.fha.nhinc.common.auditquerylog.QueryAuditEventsResponseType retrieveAuditsByMsgIdAndRelatesToId(gov.hhs.fha.nhinc.common.auditquerylog.QueryAuditEventsRequestByRequestMessageId request) {
    gov.hhs.fha.nhinc.common.auditquerylog.QueryAuditEventsResponseType response = null;
    try {
        gov.hhs.fha.nhinc.messaging.client.CONNECTClient<gov.hhs.fha.nhinc.common.nhinccomponentauditquerylog.AuditQueryLogPortType> client = getCONNECTClient(getQueryAuditEventsByMessageIdAndRelatesToPortDescriptor());
        response = ((gov.hhs.fha.nhinc.common.auditquerylog.QueryAuditEventsResponseType) (client.invokePort(gov.hhs.fha.nhinc.common.nhinccomponentauditquerylog.AuditQueryLogPortType.class, QUERY_AUDIT_EVENTS_BY_MSG_RELATESTO_ID, request)));
    } catch (java.lang.Exception ex) {
        gov.hhs.fha.nhinc.auditquerylog.nhinc.proxy.AuditQueryLogProxyWebServiceUnsecuredImpl.LOG.debug((("Failed to call the web service " + (gov.hhs.fha.nhinc.nhinclib.NhincConstants.ADAPTER_AUDIT_QUERY_LOG_SERVICE_NAME)) + (ex.getLocalizedMessage())), ex);
    }
    return response;
}