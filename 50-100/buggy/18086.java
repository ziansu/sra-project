public static java.lang.String addPadding(java.lang.String encoded, boolean urlSafe) {
    java.lang.String padding = (urlSafe) ? "." : "=";
    java.lang.StringBuilder buffer = new java.lang.StringBuilder(encoded);
    while (((encoded.length()) % 4) != 0) {
        buffer.append(padding);
    } 
    return buffer.toString();
}