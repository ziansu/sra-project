@org.junit.Test
public void testCASAfterAdd() throws java.lang.Exception {
    java.util.concurrent.Future<java.lang.Boolean> future = _client.add("foo", 32000, 123);
    assertTrue(future.get());
    com.thimbleware.jmemcached.test.CASValue<java.lang.Object> casValue = _client.gets("foo");
    org.junit.Assert.assertEquals(123, casValue.getValue());
}