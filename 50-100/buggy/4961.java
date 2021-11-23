@org.junit.Test(timeout = 50000)
public void testPutAndGet() throws java.io.IOException, java.lang.InterruptedException {
    supplyMap(java.lang.Integer.class, java.lang.String.class, ( mapProxy) -> {
        mapProxy.put(1, "hello");
        org.junit.Assert.assertEquals(1, mapProxy.size());
    });
}