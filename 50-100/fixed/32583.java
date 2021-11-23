@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testReleaseSameInstanceMultipleTimesThrows() throws java.lang.Exception {
    org.ehcache.internal.classes.ClassInstanceProvider<java.lang.String, java.lang.String> classInstanceProvider = new org.ehcache.internal.classes.ClassInstanceProvider<java.lang.String, java.lang.String>(null, null);
    classInstanceProvider.providedVsCount.put("foo", new java.util.concurrent.atomic.AtomicInteger(1));
    classInstanceProvider.releaseInstance("foo");
    classInstanceProvider.releaseInstance("foo");
}