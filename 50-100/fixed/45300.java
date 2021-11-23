public static long fib(int n) {
    (Fibonacci.count)++;
    if (n <= 1) {
        return n;
    }else {
        return (Fibonacci.fib((n - 1))) + (Fibonacci.fib((n - 2)));
    }
}