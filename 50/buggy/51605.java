public boolean isPrime(int num) {
    for (int x = 2; x < (java.lang.Math.sqrt(num)); x++) {
        if ((num % x) == 0)
            return false;
        
    }
    return true;
}