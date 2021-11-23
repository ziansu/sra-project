private boolean remove(java.util.ArrayList<server.datatypes.ServerEvent> events, java.lang.String toRemove) {
    boolean removed = false;
    for (server.datatypes.ServerEvent event : events) {
        if (event.getEventName().equals(toRemove)) {
            events.remove(event);
            event.cancel();
            scheduler.purge();
            removed = true;
        }
    }
    return removed;
}