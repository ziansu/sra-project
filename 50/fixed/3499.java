public void callback(org.jboss.pnc.spi.events.BuildSetStatusChangedEvent buildSetStatusChangedEvent) {
    callback.accept(buildSetStatusChangedEvent);
}