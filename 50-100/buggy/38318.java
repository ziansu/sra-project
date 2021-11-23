public static java.lang.String trimLastSeparator(java.lang.String separator, java.lang.String str) {
    if ((str.length()) > 0) {
        if ((str.lastIndexOf(separator)) == ((str.length()) - 1)) {
            str = str.substring(0, ((str.length()) - 2));
        }
    }
    return str;
}