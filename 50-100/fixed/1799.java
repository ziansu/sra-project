public java.util.List<utils.Event> getMonthEvents(int year, int month) {
    events = eventHandler.getAllEvents();
    java.util.List<utils.Event> monthEvents = new java.util.ArrayList<>();
    filterToMonth(year, month, monthEvents);
    sortByStartDateTime(monthEvents);
    return monthEvents;
}