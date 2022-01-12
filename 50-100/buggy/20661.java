public java.util.List<java.lang.Integer> generate(int startingValue, int endingValue) {
    int lowVal = (startingValue < endingValue) ? startingValue : endingValue;
    int highVal = (lowVal == startingValue) ? endingValue : startingValue;
    java.util.List<java.lang.Integer> primes = new java.util.LinkedList<>();
    for (int i = lowVal; i < highVal; i++) {
        if (isPrime(i)) {
            primes.add(i);
        }
    }
    return primes;
}