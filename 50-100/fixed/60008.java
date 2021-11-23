@java.lang.Override
public lifetracker.calendar.CalendarList execute(lifetracker.calendar.CalendarList calendar) {
    assert calendar != null;
    assert !(executed);
    if ((endDateTime) == null) {
        addedEntryID = calendar.add(name);
    }else
        if ((startDateTime) == null) {
            addedEntryID = calendar.add(name, endDateTime);
        }else {
            addedEntryID = calendar.add(name, startDateTime, endDateTime);
        }
    
    comment = java.lang.String.format(lifetracker.command.AddCommand.MESSAGE_ADDED, name);
    executed = true;
    return calendar;
}