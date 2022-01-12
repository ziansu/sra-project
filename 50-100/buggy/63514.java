public static int threeDigitProduct() {
    for (int x = 999; x > 0; x--) {
        for (int y = 999; y > 0; y--) {
            int z = y * x;
            if (LargestPalindromeProduct.isPalindrome(z)) {
                int k = LargestPalindromeProduct.isLargest(y, x);
                return k;
            }
        }
    }
    return 0;
}