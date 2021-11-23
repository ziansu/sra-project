public void setDefaultSecureEndpoint(org.eclipse.californium.core.network.Endpoint endpoint) {
    if ((this.default_secure_endpoint) != null) {
        this.default_secure_endpoint.destroy();
    }
    this.default_secure_endpoint = endpoint;
    if (!(this.default_secure_endpoint.isStarted())) {
        try {
            default_secure_endpoint.start();
            org.eclipse.californium.core.network.EndpointManager.LOGGER.log(java.util.logging.Level.INFO, ("Started new default secure endpoint " + (default_endpoint.getAddress())));
        } catch (java.io.IOException e) {
            org.eclipse.californium.core.network.EndpointManager.LOGGER.log(java.util.logging.Level.SEVERE, "Could not start new default secure endpoint", e);
        }
    }
}