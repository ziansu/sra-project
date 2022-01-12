public void addEvent(edu.brown.cs.andrew.handlers.Event e) {
    if ((e.getId()) >= 0) {
        maxEventId += 1;
        e.setID(maxEventId);
        java.lang.System.out.println(events);
    }
    events.put(maxEventId, e);
    java.lang.System.out.println(("EVENT ID: " + (e.getId())));
}