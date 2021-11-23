@org.junit.Test
public void testFibonacci() {
    org.junit.Assert.assertEquals("Fibonacci for 1 should be 1", 1, sample.webserver.math.MathOperations.calculateFibonacci(1));
    org.junit.Assert.assertEquals("Fibonacci for 2 should be 1", 3, sample.webserver.math.MathOperations.calculateFibonacci(2));
    org.junit.Assert.assertEquals("Fibonacci for 10 should be 55", 55, sample.webserver.math.MathOperations.calculateFibonacci(10));
}