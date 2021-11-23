private com.voxeo.moho.Endpoint resolveFrom() {
    com.voxeo.moho.Endpoint fromEndpoint = null;
    java.net.URI from = model.getFrom();
    if (from != null) {
        fromEndpoint = participant.getApplicationContext().createEndpoint(from.toString());
    }else {
        fromEndpoint = participant.getAddress();
    }
    return fromEndpoint;
}