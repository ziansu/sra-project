public void activate(org.jboss.errai.bus.server.api.MessageQueue queue) {
    queue.setActivationCallback(null);
    cont.resume();
}