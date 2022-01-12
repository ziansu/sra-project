public void addEvent(edu.brown.cs.andrew.handlers.Event e) {
    maxEventId += 1;
    e.setID(maxEventId);
    events.put(maxEventId, e);
}