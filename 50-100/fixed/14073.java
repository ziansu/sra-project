public static com.google.appengine.archetypes.scheduler.wrappers.WrappedBoolean addEvent(java.lang.String calendarId, final com.google.appengine.api.users.User user, com.google.appengine.archetypes.scheduler.service.Event event) throws java.io.IOException {
    com.google.appengine.archetypes.scheduler.service.Calendar service = com.google.appengine.archetypes.scheduler.service.Quickstart.getCalendarService(user);
    event = service.events().insert(calendarId, event).execute();
    java.lang.System.out.printf("Event created: %s\n", event.getHtmlLink());
    return null;
}