private static int sumOfDivisors(int seed) {
    int total = 0;
    for (int i = 1; i <= (seed / 2); i++) {
        if ((seed % i) == 0) {
            total += i;
        }
    }
    return total;
}