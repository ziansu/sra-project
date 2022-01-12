private static boolean isFilteredTextPalindrome(java.lang.String filteredText) {
    if ((filteredText.length()) <= 1) {
        return true;
    }else
        if ((filteredText.charAt(0)) == (filteredText.charAt(((filteredText.length()) - 1)))) {
            filteredText = filteredText.substring(1, ((filteredText.length()) - 1));
            return palindrome.Palindrome.isFilteredTextPalindrome(filteredText);
        }else
            return false;
        
    
}