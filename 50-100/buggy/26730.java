@org.testng.annotations.Test(expectedExceptions = com.fasterxml.jackson.databind.JsonMappingException.class, expectedExceptionsMessageRegExp = "Nested properties are not supported. \\(\'test1\\\' field\\)")
public void testInvalidArrayRecursiveType() throws java.lang.Exception {
    org.rakam.collection.Event.EventContext api = new org.rakam.collection.Event.EventContext(apiKeys.writeKey, "1.0", null, null);
    byte[] bytes = mapper.writeValueAsBytes(com.google.common.collect.ImmutableMap.of("project", "test", "collection", "test", "api", api, "properties", com.google.common.collect.ImmutableMap.of("test0", "test", "test1", com.google.common.collect.ImmutableList.of("test", com.google.common.collect.ImmutableMap.of("test", 2)), "test2", false)));
    mapper.readValue(bytes, org.rakam.collection.Event.class);
}