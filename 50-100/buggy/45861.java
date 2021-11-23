public static int getLastDigitOfFibonacciNumber(int n) {
    int[] fibArray = new int[n + 1];
    fibArray[0] = 0;
    fibArray[1] = 1;
    for (int i = 2; i <= n; i++) {
        fibArray[i] = (fibArray[(i - 1)]) + (fibArray[(i - 2)]);
    }
    return (fibArray[n]) % 10;
}