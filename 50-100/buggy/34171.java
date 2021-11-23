public static boolean isEmpty(java.lang.String str) {
    if (str.isEmpty())
        return true;
    
    while ((str.startsWith(" ")) || (str.startsWith("\t"))) {
        str = str.substring(1);
    } 
    if (str.startsWith("#"))
        return true;
    
    return false;
}