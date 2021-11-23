@org.testng.annotations.Test(expectedExceptions = com.fasterxml.jackson.databind.JsonMappingException.class, expectedExceptionsMessageRegExp = "'collection' field must be located before 'properties' field.")
public void testInvalidOrder() throws java.lang.Exception {
    org.rakam.collection.Event.EventContext api = new org.rakam.collection.Event.EventContext(apiKeys.writeKey, "1.0", null, null);
    byte[] bytes = mapper.writeValueAsBytes(com.google.common.collect.ImmutableMap.of("project", "test", "properties", com.google.common.collect.ImmutableMap.of("test0", "test", "test1", com.google.common.collect.ImmutableList.of("test", "test"), "test2", false), "api", api, "collection", "test"));
    mapper.readValue(bytes, org.rakam.collection.Event.class);
}