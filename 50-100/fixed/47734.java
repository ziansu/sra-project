public static int fibonacci(int n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return 1;
    }
    return (Aufgaben_Eisenbiegler.Rekursion_Fibonacci.fibonacci((n - 1))) + (Aufgaben_Eisenbiegler.Rekursion_Fibonacci.fibonacci((n - 2)));
}