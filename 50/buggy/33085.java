public com.peterphi.std.guice.restclient.jaxb.webquery.WebQuery and(java.util.function.Consumer<com.peterphi.std.guice.restclient.jaxb.webquery.WQGroup> consumer) {
    final com.peterphi.std.guice.restclient.jaxb.webquery.WQGroup and = and();
    add(and);
    if (consumer != null)
        consumer.accept(and);
    
    return this;
}