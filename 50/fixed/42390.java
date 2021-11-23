private static boolean isPrime(long n) {
    for (long prime : problems.problem3.Problem3.primes) {
        if ((n % prime) == 0) {
            return false;
        }
    }
    return true;
}