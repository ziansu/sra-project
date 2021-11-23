public void setTransportUrl(java.lang.String transportUrl) {
    try {
        this.transportUrl = new java.net.URI(transportUrl);
    } catch (java.net.URISyntaxException e) {
        throw new java.lang.RuntimeException((("Incorrect transport URL [" + transportUrl) + "]"), e);
    }
}