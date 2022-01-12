public void aggregate(com.telefonica.iot.cygnus.sinks.TwitterEvent cygnusEvent) throws java.lang.Exception {
    java.lang.String eventData = cygnusEvent.getEventData();
    if ((eventData == null) || (eventData.isEmpty())) {
        com.telefonica.iot.cygnus.sinks.TwitterHDFSSink.LOGGER.warn("No event data (tweet), nothing is done ");
        return ;
    }
    aggregation += tweet2row(eventData);
}