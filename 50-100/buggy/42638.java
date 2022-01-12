public static java.util.ArrayList<java.lang.Integer> findPrimeNumbers(int begin, int end) {
    java.util.ArrayList<java.lang.Integer> primes = new java.util.ArrayList<java.lang.Integer>();
    primes = com.example.datastructuresandalgorithms.PrimeNumber.findPrime_one(begin, end);
    com.example.datastructuresandalgorithms.PrimeNumber.printArray(primes);
    primes = com.example.datastructuresandalgorithms.PrimeNumber.findPrime_two(begin, end);
    com.example.datastructuresandalgorithms.PrimeNumber.printArray(primes);
    primes = com.example.datastructuresandalgorithms.PrimeNumber.findPrime_three(begin, end);
    com.example.datastructuresandalgorithms.PrimeNumber.printArray(primes);
    return primes;
}