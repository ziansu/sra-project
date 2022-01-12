private static int findValue(int needle, java.lang.Integer[] haystack) {
    int start = 0;
    int end = (haystack.length) - 1;
    while (start <= end) {
        int midpoint = (start + end) / 2;
        int test = haystack[midpoint];
        if (test == needle) {
            return midpoint;
        }else
            if (test < needle) {
                start = midpoint + 1;
            }else {
                end = midpoint - 1;
            }
        
    } 
    return -1;
}