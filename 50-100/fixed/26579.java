public java.util.List<com.macklive.objects.Message> getMessagesForGameAfterDate(long gameId, java.util.Date date) {
    com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Message");
    q.setFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.and(new com.google.appengine.api.datastore.Query.FilterPredicate("game", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, gameId), new com.google.appengine.api.datastore.Query.FilterPredicate("time", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, date)));
    q.addSort("time", SortDirection.ASCENDING);
    return getMessageByQuery(q);
}