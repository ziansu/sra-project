@java.lang.Override
public void add(java.lang.String name, java.time.LocalDateTime start, java.time.LocalDateTime end) {
    int idToSet = (java.lang.Math.max(eventList.lastKey(), taskList.lastKey())) + 1;
    lifetracker.calendar.CalendarEntryImpl e = new lifetracker.calendar.CalendarEntryImpl(name, start, end, idToSet);
    eventList.put(idToSet, e);
}