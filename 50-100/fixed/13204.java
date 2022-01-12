public java.util.Set<org.jitsi.videobridge.Endpoint> getSelectedEndpoints() {
    java.util.Set<org.jitsi.videobridge.Endpoint> result = new java.util.HashSet<>();
    for (java.lang.ref.WeakReference<org.jitsi.videobridge.Endpoint> wr : weakSelectedEndpoints) {
        org.jitsi.videobridge.Endpoint endpoint = checkEndpointWeakReference(wr);
        if (endpoint != null) {
            result.add(endpoint);
        }
    }
    return result;
}