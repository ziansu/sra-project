public static void main(java.lang.String[] args) {
    try {
        com.lftechnology.java.training.sanish.palindrome.Main.LOGGER.log(java.util.logging.Level.INFO, "Largest palindrome made from the product of two {0}-digit numbers: {1}", new java.lang.Object[]{ com.lftechnology.java.training.sanish.palindrome.Main.DIGIT_NUM , com.lftechnology.java.training.sanish.palindrome.Palindrome.getLargestPalindrome(com.lftechnology.java.training.sanish.palindrome.Main.DIGIT_NUM) });
    } catch (java.lang.Exception e) {
        com.lftechnology.java.training.sanish.palindrome.Main.LOGGER.log(java.util.logging.Level.WARNING, "Exception : {1}", new java.lang.Object[]{ e });
    }
}