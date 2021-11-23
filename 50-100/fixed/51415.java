public static boolean checkingAllUpperCase(java.lang.String str1) {
    char[] charArray = str1.toCharArray();
    if ((str1.length()) == 1) {
        return false;
    }
    if (java.lang.Character.isUpperCase(charArray[1])) {
        return true;
    }
    return false;
}