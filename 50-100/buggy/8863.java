void register(com.kk.bus.Bus bus, java.lang.Object objectToRegister, java.util.Set<java.lang.reflect.Method> subscriberMethods, com.kk.bus.DeliveryContext deliveryContext) {
    synchronized(this) {
        com.kk.bus.EventDeliverer eventDeliverer = mObjectDeliverers.get(objectToRegister);
        if (eventDeliverer == null) {
            eventDeliverer = new com.kk.bus.EventDeliverer(bus, objectToRegister, deliveryContext);
            mObjectDeliverers.put(objectToRegister, eventDeliverer);
        }
        eventDeliverer.setSubscriberMethods(subscriberMethods);
    }
}