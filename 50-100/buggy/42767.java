@org.junit.Test
public void checkReachedLimitSuccessTest() throws eu.europeana.corelib.db.exception.DatabaseException, eu.europeana.corelib.db.exception.LimitReachedException {
    eu.europeana.corelib.definitions.db.entity.relational.ApiKey apiKey = new eu.europeana.corelib.db.entity.relational.ApiKeyImpl();
    apiKey.setApiKey("testKey");
    apiKey.setPrivateKey("testKey");
    apiKey.setUsageLimit(2L);
    apiLogService.logApiRequest(apiKey.getId(), "paris", RecordType.SEARCH, "standard");
    long requested = apiKeyService.checkReachedLimit(apiKey);
    org.junit.Assert.assertEquals(1, requested);
}