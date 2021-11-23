private void handleDeclarationOfInterest(org.apache.camel.Exchange exchange, com.akivaliaho.ServiceEvent serviceEvent) {
    if (serviceEvent.getEventName().equals("declarationOfInterests")) {
        registerInterests(exchange, serviceEvent);
    }
}