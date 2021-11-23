@org.junit.Test
public void isPrimeForPrimeNonNumber() {
    assertFalse(us.oder.euler.PrimeFactorGenerator.isPrime(4L));
    assertFalse(us.oder.euler.PrimeFactorGenerator.isPrime(6L));
    assertFalse(us.oder.euler.PrimeFactorGenerator.isPrime(22L));
    assertFalse(us.oder.euler.PrimeFactorGenerator.isPrime(100L));
}