public static java.lang.String mergeIntoText(java.util.List<java.lang.String> tokens) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String tok : tokens) {
        sb.append(tok).append(' ');
    }
    if ((sb.length()) <= 1)
        return null;
    
    return sb.deleteCharAt(((sb.length()) - 1)).toString();
}