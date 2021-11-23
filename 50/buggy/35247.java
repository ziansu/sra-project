public void activate(org.jboss.errai.bus.server.api.MessageQueue queue) {
    java.lang.System.out.println("activating jetty callback");
    queue.setActivationCallback(null);
    cont.resume();
}