public static java.lang.String ellipsis(java.lang.String text, int length) {
    if (((text.length()) <= 0) || (length <= 0))
        throw new java.security.InvalidParameterException("length 는 0 이하일 수 없습니다");
    
    if ((text.length()) > length) {
        java.lang.String decoString = "...";
        java.lang.String reduced = text.substring(0, (length - 1));
        reduced += decoString;
        return reduced;
    }
    return text;
}