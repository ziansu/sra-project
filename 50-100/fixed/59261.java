public com.aix.city.core.Event createEvent(java.lang.String message) {
    long ID = 0;
    com.aix.city.core.User user = com.aix.city.core.AIXLoginModule.getInstance().getLoggedInUser();
    java.sql.Timestamp now = new java.sql.Timestamp(java.lang.System.currentTimeMillis());
    com.aix.city.core.Event event = new com.aix.city.core.Event(ID, message, now, 0, user, false, location, 0, false);
    getPosts().add(0, event);
    return event;
}