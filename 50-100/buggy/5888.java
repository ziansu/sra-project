static boolean isPalindrome(java.lang.String s, int length) {
    int n = 0;
    if ((length == 1) || (length == 0)) {
        return true;
    }
    if ((s.charAt(0)) == (s.charAt((length - 1)))) {
        return Exercise2.isPalindrome(s.substring(1, (length - 1)), (length - 2));
    }else {
        return false;
    }
}