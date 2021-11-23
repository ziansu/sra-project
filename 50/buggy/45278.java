public static int getNextPrime(int num) {
    while (!(MathUtils.isPrime(num))) {
        num++;
    } 
    return num;
}