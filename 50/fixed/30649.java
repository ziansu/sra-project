public Event getNextEvent() {
    if ((currentEventIndex) < (events.size())) {
        return events.get(((currentEventIndex)++));
    }else {
        return null;
    }
}