public long getNextPrimeNumber(java.util.List<java.lang.Long> primeNumbers, long lastPrime) {
    long nextPrime = lastPrime + 1;
    while (!(isAPrime(primeNumbers, nextPrime))) {
        nextPrime++;
    } 
    return nextPrime;
}