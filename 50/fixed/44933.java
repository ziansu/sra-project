synchronized com.kk.bus.EventDeliverer getEventDelivererWithProducerForRegisteredObject(java.lang.Object registeredObject) {
    com.kk.bus.EventDeliverer eventDeliverer = mObjectDeliverers.get(registeredObject);
    if (eventDeliverer != null) {
        if (eventDeliverer.hasProducerMethod()) {
            return eventDeliverer;
        }
    }
    return null;
}