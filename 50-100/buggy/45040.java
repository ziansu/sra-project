@org.testng.annotations.Test
public void testCompute() {
    org.testng.Assert.assertEquals(fibonacciSequenceGenerator.compute(1), java.util.Arrays.asList(0L));
    org.testng.Assert.assertEquals(fibonacciSequenceGenerator.compute(2), java.util.Arrays.asList(0L, 1L));
    org.testng.Assert.assertEquals(fibonacciSequenceGenerator.compute(3), java.util.Arrays.asList(0L, 1L, 1L));
    verify(readLock, times(3)).lock();
    verify(writeLock, times(1)).lock();
}