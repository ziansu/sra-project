private void stopCollection(com.adobe.acs.tools.explain_query.impl.ExplainQueryServlet.QueryLogCollector logCollector, java.lang.String key) {
    org.slf4j.MDC.remove(key);
    if (logCollector != null) {
        logCollector.stopCollection(key);
    }
}