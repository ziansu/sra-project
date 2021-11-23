private void addRegistration(java.lang.String endpoint) {
    if (endpoint.startsWith(net.openright.mobile.server.SubscriberServlet.ENDPOINT_PREFIX)) {
        this.registrations.add(endpoint.substring(net.openright.mobile.server.SubscriberServlet.ENDPOINT_PREFIX.length()));
    }else {
        this.registrations.add(endpoint);
    }
}