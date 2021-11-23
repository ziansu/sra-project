public java.util.List<com.macklive.objects.Message> getMessagesForGame(long gameId) {
    com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Message");
    com.google.appengine.api.datastore.Key game = com.google.appengine.api.datastore.KeyFactory.createKey("Game", gameId);
    q.setFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.and(new com.google.appengine.api.datastore.Query.FilterPredicate("game", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, game), new com.google.appengine.api.datastore.Query.FilterPredicate("owner", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, userService.getCurrentUser().getUserId())));
    q.addSort("time", SortDirection.ASCENDING);
    return getMessageByQuery(q);
}