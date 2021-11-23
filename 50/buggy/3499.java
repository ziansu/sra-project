public void callback(org.jboss.pnc.spi.events.BuildSetStatusChangedEvent buildSetStatusChangedEvent) {
    if ((callback) != null) {
        callback.accept(buildSetStatusChangedEvent);
    }
}