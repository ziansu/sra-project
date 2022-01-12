public static boolean isEmpty(java.lang.String str) {
    while ((str.startsWith(" ")) || (str.startsWith("\t"))) {
        str = str.substring(1);
    } 
    if (str.isEmpty())
        return true;
    
    if (str.startsWith("#"))
        return true;
    
    return false;
}