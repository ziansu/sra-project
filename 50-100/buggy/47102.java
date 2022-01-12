@java.lang.Override
public void configure() throws java.lang.Exception {
    for (int i = 0; i < (endpoints.size()); i++) {
        from(((endpoints.get(i)) + "?concurrentConsumers=2")).routeId(("Node2OwnerRoute" + (brokerUri))).wireTap("bean:messagingService?method=inspectMessage").to("bean:wonMessageIntoCamelProcessor").to("bean:wellformednessChecker").to("bean:uriNodePathChecker").to("bean:signatureChecker").to("bean:linkedDataCacheInvalidator").to("bean:mainOwnerMessageProcessor");
    }
}