public boolean isPrime(long n) {
    int i = 0;
    while (true) {
        if ((n % (PRIMES[i])) == 0)
            return false;
        
        if (((PRIMES[i]) * (PRIMES[i])) > n)
            return true;
        
        i++;
    } 
}