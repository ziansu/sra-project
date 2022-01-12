private static java.lang.String toUpperCaseFirstOne(java.lang.String name) {
    char[] cs = name.toCharArray();
    cs[0] -= 32;
    return java.lang.String.valueOf(cs);
}