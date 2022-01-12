public static boolean areRotations(java.lang.String str1, java.lang.String str2) {
    java.lang.String temp = str1 + str1;
    if ((str1.length()) != (str2.length())) {
        return false;
    }else
        if (temp.contains(str2)) {
            return true;
        }else {
            return false;
        }
    
}