public long getNumDivisors(long n) {
    int numDivisors = 0;
    for (long i = n; i > 0; i--) {
        if ((n % i) == 0) {
            numDivisors++;
        }
    }
    return numDivisors;
}