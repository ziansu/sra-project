public static com.google.api.services.calendar.Calendar loadCalendarClient(java.lang.String userId) throws java.io.IOException {
    userId = com.google.appengine.api.users.UserServiceFactory.getUserService().getCurrentUser().getUserId();
    com.google.api.client.auth.oauth2.Credential credential = com.google.appengine.archetypes.service.CalendarUtility.newFlow().loadCredential(userId);
    return new com.google.api.services.calendar.Calendar.Builder(com.google.appengine.archetypes.service.CalendarUtility.HTTP_TRANSPORT, com.google.appengine.archetypes.service.CalendarUtility.JSON_FACTORY, credential).build();
}