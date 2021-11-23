private void wrapChannelInErrorHandler(org.apache.camel.Channel channel, org.apache.camel.spi.RouteContext routeContext) throws java.lang.Exception {
    if (((isInheritErrorHandler()) == null) || (isInheritErrorHandler())) {
        log.trace("{} is configured to inheritErrorHandler", org.owasp.encoder.Encode.forJava(this.toString()));
        org.apache.camel.Processor output = channel.getOutput();
        org.apache.camel.Processor errorHandler = wrapInErrorHandler(routeContext, output);
        channel.setErrorHandler(errorHandler);
    }else {
        log.debug("{} is configured to not inheritErrorHandler.", org.owasp.encoder.Encode.forJava(this.toString()));
    }
}