@java.lang.Override
public lifetracker.calendar.CalendarList undo(lifetracker.calendar.CalendarList calendar) {
    assert calendar != null;
    assert executed;
    calendar.delete(addedEntryID);
    comment = java.lang.String.format(lifetracker.command.AddCommand.MESSAGE_UNDO, addedEntryID, name);
    return calendar;
}