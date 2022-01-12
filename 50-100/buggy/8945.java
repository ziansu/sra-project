public org.simplebooks.integration.appdirect.model.appdirect.SubscriptionEvent getEvent(java.lang.String eventUrl) {
    java.lang.String eventJson = getEventJson(eventUrl);
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    org.simplebooks.integration.appdirect.model.appdirect.SubscriptionEvent result = null;
    try {
        result = mapper.readValue(eventJson, org.simplebooks.integration.appdirect.model.appdirect.SubscriptionEvent.class);
        java.lang.System.out.println(result.getPayload().getAccount().getAccountIdentifier());
        java.lang.System.out.println(result.getPayload().getOrder().getEditionCode());
    } catch (java.io.IOException iox) {
        iox.printStackTrace();
        result = null;
    }
    return result;
}