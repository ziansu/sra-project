public static long fib(long n) {
    if (n < 0)
        n = -n;
    
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return 1;
    }
    long result = 1;
    long prev = 0;
    long next = 1;
    for (long i = 1; i < n; ++i) {
        result = prev + next;
        prev = next;
        next = result;
    }
    return result;
}