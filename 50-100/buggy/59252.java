public static boolean isPrime(java.lang.Long num) {
    for (int i = 2; i <= (java.lang.Math.sqrt(num)); i++) {
        if ((num % i) == 0) {
            return false;
        }
    }
    return true;
}