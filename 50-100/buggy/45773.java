private java.util.List<java.lang.String> getEventIds(java.util.List<org.xwiki.eventstream.Event> events, java.util.List<java.lang.String> entityIds) {
    java.util.List<java.lang.String> eventIds = new java.util.ArrayList<>();
    for (org.xwiki.eventstream.Event event : events) {
        entityIds.add(event.getId());
    }
    return eventIds;
}