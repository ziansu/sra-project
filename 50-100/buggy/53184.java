private org.jitsi.impl.neomedia.recording.SynchronizerImpl.Endpoint getEndpoint(java.lang.String endpointId) {
    org.jitsi.impl.neomedia.recording.SynchronizerImpl.Endpoint endpoint = endpoints.get(endpointId);
    if (endpoint == null) {
        synchronized(endpoints) {
            endpoint = endpoints.get(endpointId);
            if (endpoint == null) {
                endpoint = new org.jitsi.impl.neomedia.recording.SynchronizerImpl.Endpoint();
                endpoints.put(endpointId, endpoint);
            }
        }
    }
    return endpoint;
}