public boolean checkPalindrome(java.lang.String s) {
    int n = s.length();
    java.lang.String temp = s.toLowerCase();
    for (int i = 0; i < (n / 2); ++i) {
        if ((temp.charAt(i)) != (temp.charAt(((n - i) - 1)))) {
            return false;
        }
    }
    return true;
}