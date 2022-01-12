@org.junit.Test
public void testProxiesMulti() throws java.lang.Throwable {
    long before = java.lang.System.currentTimeMillis();
    for (int i = 0; i < 1; ++i)
        testProxies();
    
    long after = java.lang.System.currentTimeMillis();
    long delta = after - before;
    java.lang.System.out.println((("testProxiesMulti(): " + delta) + "ms"));
}