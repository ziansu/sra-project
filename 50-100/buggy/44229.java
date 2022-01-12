@org.junit.Test
public void testReachedLimit() {
    com.amazon.dao.APIKeyCache akc = com.amazon.dao.APIKeyCache.getInstance();
    com.amazon.keys.APIKey k = akc.getNewKey();
    org.junit.Assert.assertFalse(akc.reachedLimit("/", k.getStringKey()));
    k.getCalls().put("/", 60);
    org.junit.Assert.assertTrue(akc.reachedLimit("/", k.getStringKey()));
}