public static java.lang.String parseCharset(java.lang.String contentType) {
    for (java.lang.String part : contentType.split(";")) {
        if (part.trim().startsWith("charset=")) {
            java.lang.String[] val = part.split("=");
            if ((val[1].length) > 1) {
                return val[1].trim();
            }
        }
    }
    return null;
}