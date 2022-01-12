static int checkProductsAboveValue() {
    int largestSoFar = 0;
    for (int x = Problem4.LargestPalindromeProduct.MIN_THREE_DIGIT_NUMBER; x < (Problem4.LargestPalindromeProduct.MAX_THREE_DIGIT_NUMBER); x++) {
        for (int y = Problem4.LargestPalindromeProduct.MIN_THREE_DIGIT_NUMBER; y < (Problem4.LargestPalindromeProduct.MAX_THREE_DIGIT_NUMBER); y++) {
            int testValue = x * y;
            if (Problem4.LargestPalindromeProduct.isPalindrome(testValue)) {
                if (largestSoFar < testValue) {
                    largestSoFar = testValue;
                }
            }
        }
    }
    return largestSoFar;
}