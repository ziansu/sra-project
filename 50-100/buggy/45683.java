private java.lang.String safeFormat(java.lang.String message, java.lang.Object... formatArgs) {
    try {
        return java.lang.String.format(message, formatArgs);
    } catch (java.util.MissingFormatArgumentException e) {
        java.lang.StringBuilder bob = new java.lang.StringBuilder(message);
        for (java.lang.Object formatArg : formatArgs) {
            bob.append("; ").append(formatArg);
        }
        return bob.toString();
    }
}