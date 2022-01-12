public static java.lang.String extractLineAroundOffset(java.lang.String text, int offset) {
    int lenText = text.length();
    int offsetStart = offset;
    while ((offsetStart > 0) && ((text.charAt(offsetStart)) != '\n')) {
        offsetStart--;
    } 
    int offsetEnd = offset;
    while ((offsetEnd < lenText) && ((text.charAt(offsetEnd)) != '\n')) {
        offsetEnd++;
    } 
    return text.substring(offsetStart, offsetEnd).trim();
}