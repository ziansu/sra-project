public static boolean isPrime(int n) {
    if (n < 2) {
        return false;
    }else
        if (n == 2) {
            return true;
        }else {
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    return false;
                }
            }
        }
    
    return true;
}