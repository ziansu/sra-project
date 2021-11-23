@java.lang.Override
public org.atmosphere.cpr.AtmosphereResource removeBroadcaster(org.atmosphere.cpr.Broadcaster broadcaster) {
    broadcasters.remove(broadcaster);
    return this;
}