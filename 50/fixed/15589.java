private void addModule(java.lang.String group_name, int group_id, db.Request request) {
    calendar.EventProvider event_provider = newEventProvider(group_name, group_id, request.site, request.db);
    event_provider.store(request.db);
    request.removeSessionAttributes("CalendarState:");
}