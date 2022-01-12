public org.atmosphere.jersey.TrackableResource<? extends org.atmosphere.cpr.Trackable> lookup(java.lang.String trackingID) {
    org.atmosphere.jersey.TrackableResource t = factoryCache.get(trackingID);
    if ((t != null) && ((t.resource()) != null)) {
        if (org.atmosphere.cpr.AtmosphereResource.class.isAssignableFrom(t.resource().getClass())) {
            org.atmosphere.cpr.AtmosphereResource.class.cast(t.resource()).addEventListener(aliveChecker);
        }
    }
    return t;
}