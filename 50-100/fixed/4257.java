public static boolean isQuoteBy(java.lang.String str, java.lang.String l, java.lang.String r) {
    if (((null == str) || (null == l)) || (null == r))
        return false;
    
    return (str.startsWith(l)) && (str.endsWith(r));
}