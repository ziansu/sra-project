public java.util.List<com.kk.bus.EventDeliverer> getEventDeliverersHavingAnyProducer(java.util.List<com.kk.bus.EventDeliverer> storeTo, java.lang.Object excludeObjectToRegister) {
    for (com.kk.bus.EventDeliverer eventDeliverer : mObjectDeliverers.values()) {
        if (eventDeliverer.hasProducerMethod()) {
            if ((excludeObjectToRegister == null) || (!(eventDeliverer.hasRegisteredObject(excludeObjectToRegister)))) {
                if (storeTo == null) {
                    storeTo = new java.util.ArrayList<>();
                }
                storeTo.add(eventDeliverer);
            }
        }
    }
    return storeTo;
}