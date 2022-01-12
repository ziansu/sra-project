public static boolean isPalindrome(java.lang.String s) {
    int first = 0;
    int second = (s.length()) - 1;
    while (first <= second) {
        if (!((s.charAt(first)) == (s.charAt(second)))) {
            return false;
        }
        first++;
        second--;
    } 
    return true;
}