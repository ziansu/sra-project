private boolean checkIfSyncInProgress(long guestId, org.fluxtream.core.connectors.Connector connector) {
    final org.fluxtream.core.api.ApiKey apiKey = guestService.getApiKey(guestId, connector);
    if (apiKey != null)
        return apiKey.synching;
    
    return false;
}