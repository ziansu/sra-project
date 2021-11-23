public static java.lang.String[] split(java.lang.String val, char sep, boolean ignoreEmptyTokens) {
    java.util.List<java.lang.String> list = com.github.obase.kit.StringKit.split2List(val, sep, ignoreEmptyTokens);
    return list == null ? null : list.toArray(new java.lang.String[list.size()]);
}