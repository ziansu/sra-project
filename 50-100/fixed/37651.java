public boolean isPrime(long n) {
    int i = 0;
    while (true) {
        if (((PRIMES[i]) * (PRIMES[i])) > n)
            return true;
        
        if ((n % (PRIMES[i])) == 0)
            return false;
        
        i++;
    } 
}