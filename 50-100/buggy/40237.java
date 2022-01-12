private static void cleanIntermediateMatches() {
    com.google.appengine.api.datastore.QueryResultIterable<com.googlecode.objectify.Key<com.playposse.egoeater.backend.schema.IntermediateMatching>> iterable = com.googlecode.objectify.ObjectifyService.ofy().load().type(com.playposse.egoeater.backend.schema.IntermediateMatching.class).keys().iterable();
    com.googlecode.objectify.ObjectifyService.ofy().delete().type(com.playposse.egoeater.backend.schema.IntermediateMatching.class).ids(iterable);
    com.playposse.egoeater.backend.generatematches.GenerateMatchesServlet.log.info("Done cleaning intermediate matching tables.");
}