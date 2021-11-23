@java.lang.Override
public int add(java.lang.String name) {
    int idToSet = (java.lang.Math.max(eventList.lastKey(), taskList.lastKey())) + 1;
    lifetracker.calendar.CalendarEntryImpl ft = new lifetracker.calendar.CalendarEntryImpl(name, null, null, idToSet);
    taskList.put(idToSet, ft);
    return idToSet;
}