protected boolean requestExceedsMaxBodySize(final org.eclipse.californium.core.coap.Request request) {
    return (request.getOptions().hasSize1()) && ((request.getOptions().getSize1()) > (maxResourceBodySize));
}