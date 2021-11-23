@org.junit.Test
public void testGetKey() {
    org.junit.Assert.assertEquals(key, object.getKey());
    org.junit.Assert.assertEquals(key, objectGeneric.getKey());
}