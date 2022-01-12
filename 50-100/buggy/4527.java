public static int findNext(java.lang.String str) {
    int index = 0;
    if ((str.indexOf(' ')) == (-1)) {
        return index;
    }
    while ((str.charAt(index)) == ' ') {
        index++;
    } 
    return index;
}