public static boolean isBeginsWithCapital(java.lang.String text) {
    if (text == "")
        return false;
    else
        return java.lang.Character.isUpperCase(text.charAt(0));
    
}