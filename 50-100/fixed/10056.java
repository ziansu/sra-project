public java.util.List<com.kencook.sharpspring.Event> getEvents(java.lang.String timestamp) throws com.kencook.sharpspring.SharpspringException {
    com.kencook.sharpspring.SharpspringRequest request = com.kencook.sharpspring.SharpspringRequestBuilder.request(1, SharpspringMethod.GET_EVENTS).where("createTimestamp").is(timestamp).build();
    com.kencook.sharpspring.responses.GetEventsResponse result = operations.query(request, com.kencook.sharpspring.responses.GetEventsResponse.class);
    if ((result.getError()) != null)
        throw new com.kencook.sharpspring.SharpspringException(result.getError());
    
    return result.getResult().getEvent();
}