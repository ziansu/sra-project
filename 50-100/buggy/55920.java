private void addCustomHeadersToMap(java.util.Map<java.lang.String, java.lang.String> headers) {
    if ((apiVersion) != null)
        headers.put("RestComm-ApiVersion", apiVersion);
    
    if ((accountId) != null)
        headers.put("RestComm-AccountSid", accountId.toString());
    
    headers.put("RestComm-CallSid", (((instanceId) + "-") + (id.toString())));
}