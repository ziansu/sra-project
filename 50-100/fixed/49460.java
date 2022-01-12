public void update(java.lang.String id, utils.Event newEvent) {
    utils.Event oldEvent;
    if ((view(id)) != null) {
        oldEvent = view(id);
        newEvent = combineEvents(oldEvent, newEvent);
        remove(oldEvent);
        add(newEvent);
    }
}