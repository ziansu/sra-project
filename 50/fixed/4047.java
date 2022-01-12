synchronized void unregister(java.lang.Object objectToUnregister) {
    com.kk.bus.EventDeliverer registeredEventObjectContext = mObjectDeliverers.remove(objectToUnregister);
    if (registeredEventObjectContext != null) {
        registeredEventObjectContext.clearOut();
    }
}