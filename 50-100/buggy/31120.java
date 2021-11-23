@java.lang.Override
protected org.atmosphere.cpr.BroadcasterConfig createBroadcasterConfig(org.atmosphere.cpr.AtmosphereServlet.AtmosphereConfig config) {
    org.atmosphere.cpr.BroadcasterConfig bc = ((org.atmosphere.cpr.BroadcasterConfig) (config.properties().get(org.atmosphere.cpr.BroadcasterConfig.class.getName())));
    if (bc == null) {
        bc = new org.atmosphere.cpr.BroadcasterConfig(org.atmosphere.cpr.AtmosphereServlet.broadcasterFilters, config);
        config.properties().put(org.atmosphere.cpr.BroadcasterConfig.class.getName(), bc);
    }
    return bc;
}