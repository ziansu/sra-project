public void update(utils.Event oldEvent, utils.Event newEvent) {
    updateStatus();
    newEvent = combineEvents(oldEvent, newEvent);
    remove(oldEvent);
    add(newEvent);
    save();
}