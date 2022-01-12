public static void shareCalendar(java.lang.String email) throws java.io.IOException {
    com.google.api.client.http.HttpRequestInitializer initializer = com.vaadin.vaadin_archetype_application.CalendarStuff.credential;
    com.google.api.services.calendar.Calendar calendar = new com.google.api.services.calendar.Calendar(com.vaadin.vaadin_archetype_application.CalendarStuff.httpTransport, com.vaadin.vaadin_archetype_application.CalendarStuff.jsonFactory, initializer);
    com.google.api.services.calendar.model.AclRule rule = new com.google.api.services.calendar.model.AclRule();
    com.google.api.services.calendar.model.AclRule.Scope scope = new com.google.api.services.calendar.model.AclRule.Scope();
    scope.setType("user");
    scope.setValue("email");
    rule.setScope(scope);
    rule.setRole("freeBusyReader");
    com.google.api.services.calendar.model.AclRule inserted = calendar.acl().insert("primary", rule).execute();
}