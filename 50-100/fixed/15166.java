public static java.lang.String concat(java.lang.String... texts) {
    if ((texts.length) == 0) {
        return "";
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String text : texts) {
        if ((text != null) && ((text.length()) > 0)) {
            sb.append(text);
        }
    }
    return sb.toString();
}