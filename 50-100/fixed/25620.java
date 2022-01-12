public java.util.List<com.macklive.objects.Message> getMessagesForGame(long gameId) {
    com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Message");
    q.setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("game", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, gameId));
    q.addSort("time", SortDirection.ASCENDING);
    return getMessageByQuery(q);
}