private eu.europeana.corelib.definitions.edm.beans.FullBean retrieveRecord(java.lang.String europeanaId, java.lang.Integer hierarchyTimeout) throws eu.europeana.corelib.edm.exceptions.MongoDBException, eu.europeana.corelib.edm.exceptions.MongoRuntimeException, eu.europeana.corelib.neo4j.exception.Neo4JException {
    long startTime = java.lang.System.currentTimeMillis();
    eu.europeana.corelib.definitions.edm.beans.FullBean result = searchService.findById(europeanaId, false, (hierarchyTimeout == null ? 0 : hierarchyTimeout));
    if (eu.europeana.api2.v2.web.controller.ObjectController.LOG.isDebugEnabled()) {
        eu.europeana.api2.v2.web.controller.ObjectController.LOG.debug((("SearchService findByID took " + ((java.lang.System.currentTimeMillis()) - startTime)) + " ms"));
    }
    return result;
}