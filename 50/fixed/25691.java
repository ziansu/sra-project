private boolean isCalendarViewValid(java.lang.String calendarView) {
    if (calendarView != null) {
        return (calendarView.equals(teamfour.tasc.logic.commands.CalendarCommand.KEYWORD_CALENDAR_VIEW_DAY)) || (calendarView.equals(teamfour.tasc.logic.commands.CalendarCommand.KEYWORD_CALENDAR_VIEW_WEEK));
    }
    return false;
}