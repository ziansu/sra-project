public utils.Event remove(utils.ParsedCommand pc) {
    utils.Event eventToBeRemoved = new utils.Event();
    for (utils.Event e : events) {
        if (e.getId().equals(pc.getId())) {
            eventToBeRemoved = e;
            break;
        }
    }
    manage.remove(eventToBeRemoved);
    events.remove(eventToBeRemoved);
    return eventToBeRemoved;
}