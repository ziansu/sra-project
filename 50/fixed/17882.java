public static long calculate(long n) {
    if (n <= 1)
        return 1;
    
    return (com.dev.factorial.Factorial.calculate((n - 1))) * n;
}