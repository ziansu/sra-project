public static java.lang.String extractLineAroundOffset(java.lang.String str, int offset) {
    int lenText = str.length();
    int offsetStart = offset;
    while ((offsetStart > 0) && ((str.charAt(offsetStart)) != '\n')) {
        offsetStart--;
    } 
    int offsetEnd = offset;
    while ((offsetEnd < lenText) && ((str.charAt(offsetEnd)) != '\n')) {
        offsetEnd++;
    } 
    return str.substring(offsetStart, offsetEnd).trim();
}