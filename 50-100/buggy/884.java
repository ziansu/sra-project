public boolean checkPalindrome(java.lang.String s) {
    int n = s.length();
    for (int i = 0; i < (n / 2); ++i) {
        if ((s.charAt(i)) != (s.charAt(((n - i) - 1)))) {
            return false;
        }
    }
    return true;
}