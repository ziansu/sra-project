@java.lang.Override
public void configure() throws java.lang.Exception {
    onException(java.lang.Exception.class).handled(true).setHeader(Exchange.HTTP_RESPONSE_CODE, constant(500)).transform(simple("An error occurred: ${exception.message}"));
    from(generateJettyEndpoint()).log(LoggingLevel.DEBUG, LOGGER, "Received request...").setExchangePattern(ExchangePattern.InOut).to(net.technolords.micro.route.RestServiceRoute.DIRECT_MAIN);
    from(net.technolords.micro.route.RestServiceRoute.DIRECT_MAIN).log(LoggingLevel.DEBUG, LOGGER, "Current headers: ${headers}").process(this.responseProcessor);
}