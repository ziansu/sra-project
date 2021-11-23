public static java.lang.String[] split(java.lang.String val, char sep, boolean ignoreEmptyTokens) {
    if ((val.length()) > 0) {
        java.util.List<java.lang.String> list = com.github.obase.kit.StringKit.split2List(val, sep, ignoreEmptyTokens);
        return list.toArray(new java.lang.String[list.size()]);
    }
    return com.github.obase.kit.StringKit.EMPTY_ARRAY;
}