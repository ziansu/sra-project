public static java.lang.String removeLeadingZeroes(java.lang.String str) {
    if (str == null) {
        return null;
    }
    int leadingZeroes;
    for (leadingZeroes = 0; (leadingZeroes < (str.length())) && ((str.charAt(leadingZeroes)) == '0'); leadingZeroes++);
    return str.substring(leadingZeroes);
}