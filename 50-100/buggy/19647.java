private static boolean isPalindrome(java.lang.String str) {
    for (int i = 0; i < ((str.length()) / 2); i++) {
        if ((str.charAt(i)) != (str.charAt(((str.length()) - i))))
            return false;
        
    }
    return true;
}