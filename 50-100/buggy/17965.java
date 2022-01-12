public static boolean isPalindrome(int x) {
    if (x < 0)
        return false;
    
    if ((0 <= x) && (x <= 11))
        return true;
    
    if ((x % 10) == 0)
        return false;
    
    int reverse = 0;
    while (x > reverse) {
        reverse = (10 * reverse) + (x % 10);
        x = x / 10;
    } 
    return (x == reverse) || (x == (reverse / 10));
}