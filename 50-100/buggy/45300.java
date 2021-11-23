public static long fib(int n) {
    if (n <= 1) {
        (Fibonacci.count)++;
        return n;
    }else {
        (Fibonacci.count)++;
        return (Fibonacci.fib((n - 1))) + (Fibonacci.fib((n - 2)));
    }
}