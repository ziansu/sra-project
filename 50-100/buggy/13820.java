public boolean hasIncomingEvent(com.bandwidth.sdk.model.events.Event event) {
    for (com.bandwidth.sdk.model.events.Event evt : events) {
        if ((evt instanceof com.bandwidth.sdk.model.events.IncomingCallEvent) && (event.getProperty("to").equalsIgnoreCase(event.getProperty("to")))) {
            return true;
        }
    }
    return false;
}