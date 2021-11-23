@org.junit.Test
public void checkReachedLimitWithDatabaseExceptionTest() throws eu.europeana.corelib.db.exception.LimitReachedException {
    eu.europeana.corelib.definitions.db.entity.relational.ApiKey apiKey = new eu.europeana.corelib.db.entity.relational.ApiKeyImpl();
    apiKey.setApiKey("testKey");
    apiKey.setPrivateKey("testKey");
    apiKey.setUsageLimit(2L);
    apiLogService.logApiRequest(apiKey.getId(), "paris", RecordType.SEARCH, "standard");
    try {
        apiKeyService.checkReachedLimit(null);
        org.junit.Assert.fail("This line should not be reached");
    } catch (eu.europeana.corelib.db.exception.DatabaseException e) {
        org.junit.Assert.assertEquals(ProblemType.INVALIDARGUMENTS, e.getProblem());
    }
}