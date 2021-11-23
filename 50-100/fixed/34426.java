private static int spiralDiagonalsSum(int size) {
    int sum = 1;
    for (int i = 3; i <= size; i += 2) {
        sum += ((4 * i) * i) - (6 * (i - 1));
    }
    return sum;
}