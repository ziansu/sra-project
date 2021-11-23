public static int largestPalindromeProduct(int max) {
    int output = 0;
    int min = (max / 10) + 1;
    for (int i = max; i > min; i--) {
        for (int j = i; j > min; j--) {
            if ((palindromeIntChecker((i * j))) && ((i * j) > output)) {
                output = i * j;
            }
        }
    }
    return output;
}