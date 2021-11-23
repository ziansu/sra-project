@org.testng.annotations.Test(expectedExceptions = org.rakam.util.RakamException.class, expectedExceptionsMessageRegExp = "Nested properties is not supported")
public void testInvalidMapRecursiveType() throws java.lang.Exception {
    org.rakam.collection.Event.EventContext api = new org.rakam.collection.Event.EventContext(apiKeys.writeKey, "1.0", null, null);
    byte[] bytes = mapper.writeValueAsBytes(com.google.common.collect.ImmutableMap.of("collection", "test", "api", api, "properties", com.google.common.collect.ImmutableMap.of("test0", "test", "test1", com.google.common.collect.ImmutableMap.of("test", com.google.common.collect.ImmutableList.of("test")), "test2", false)));
    mapper.readValue(bytes, org.rakam.collection.Event.class);
}