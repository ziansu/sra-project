public static java.lang.String subPostfix(java.lang.String str, int startIndex, int endIndex, java.lang.String postfix) {
    if (isBlank(str))
        return "";
    
    int length = str.length();
    if (length <= startIndex) {
        return str;
    }else
        if (length <= endIndex) {
            return str.substring(startIndex, length);
        }else {
            return (str.substring(startIndex, endIndex)) + postfix;
        }
    
}