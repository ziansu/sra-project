private boolean remove(java.util.ArrayList<server.datatypes.ServerEvent> events, java.lang.String toRemove) {
    boolean removed = false;
    for (int i = 0; i < (events.size()); i++) {
        if (events.get(i).getEventName().equals(toRemove)) {
            events.get(i).cancel();
            events.remove(i);
            removed = true;
            i--;
        }
    }
    scheduler.purge();
    return removed;
}