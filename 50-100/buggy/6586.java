public void receive(final org.thingml.java.ext.Event event, final org.thingml.java.Port p) {
    if (active) {
        event.setPort(p);
        queue.offer(event);
        if (((root) == null) && (active.get())) {
            for (org.thingml.java.Component child : forks) {
                final org.thingml.java.ext.Event child_e = event.clone();
                child.receive(child_e, p);
            }
        }
    }
}