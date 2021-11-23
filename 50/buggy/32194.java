public void addEvent(edu.brown.cs.andrew.handlers.Event e) {
    (maxEventId)++;
    e.setID(maxEventId);
    events.put(maxEventId, e);
}