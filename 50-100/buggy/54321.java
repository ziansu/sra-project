public static boolean isPrime(int n) {
    boolean itIsAPrime = true;
    if (n < 2) {
        itIsAPrime = false;
    }else
        if (n == 2) {
            itIsAPrime = true;
        }else {
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    itIsAPrime = false;
                }else {
                    itIsAPrime = true;
                }
            }
        }
    
    return itIsAPrime;
}