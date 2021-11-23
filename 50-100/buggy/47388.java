public static long fib(long n) {
    long result = 0;
    long prev = 0;
    long next = 1;
    for (long i = 1; i < n; ++i) {
        result = prev + next;
        prev = next;
        next = result;
    }
    return result;
}