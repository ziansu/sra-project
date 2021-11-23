public static boolean isBeginsWithCapital(java.lang.String text) {
    if ((text.length()) == 0)
        return false;
    else
        return java.lang.Character.isUpperCase(text.charAt(0));
    
}