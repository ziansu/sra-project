@java.lang.Override
public org.atmosphere.cpr.AtmosphereResource removeBroadcaster(org.atmosphere.cpr.Broadcaster broadcaster) {
    if ((broadcasters.size()) > 1) {
        broadcasters.remove(broadcaster);
    }
    return this;
}