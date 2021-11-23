public boolean isPalindrome(java.lang.String num) {
    if (null == num)
        return false;
    
    if (0 == (num.length()))
        return false;
    
    char[] digits = num.toCharArray();
    int i = 0;
    int j = (digits.length) - 1;
    while (i <= j) {
        if ((digits[(i++)]) != (digits[(j--)]))
            return false;
        
    } 
    return true;
}