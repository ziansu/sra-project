public static boolean isPalindrome(java.lang.String str) {
    if ((str.charAt(0)) != (str.charAt(((str.length()) - 1))))
        return false;
    
    return ((str.length()) < 3) || (com.timvisee.hhsbigjava.c5.BigJavaP5_16.isPalindrome(str.substring(1, ((str.length()) - 1))));
}