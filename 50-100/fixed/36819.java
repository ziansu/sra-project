private void logResponse(javax.ws.rs.core.Response response) {
    if (nl.openweb.monitor.Monitor.LOG.isDebugEnabled()) {
        nl.openweb.monitor.Monitor.LOG.debug("get request to {} resulted in a {}", page.getUrl(), response.getStatus());
        nl.openweb.monitor.Monitor.LOG.debug("get request to {} response type check result: {}", page.getUrl(), checkResponseContentType(response));
    }
}