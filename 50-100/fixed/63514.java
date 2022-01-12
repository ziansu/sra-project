public static int threeDigitProduct() {
    for (int x = 999; x > 0; x--) {
        for (int y = 999; y > 0; y--) {
            int z = y * x;
            if (LargestPalindromeProduct.isPalindrome(z)) {
                return z;
            }
        }
    }
    return 0;
}