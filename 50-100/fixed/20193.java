public static java.lang.String toTitleCase(java.lang.String title) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    java.lang.String[] parts = title.split(" ");
    for (java.lang.String part : parts) {
        if ((result.length()) != 0) {
            result.append(" ");
        }
        result.append(com.eightycats.litterbox.util.StringUtils.toSentenceCase(part.toLowerCase()));
    }
    return result.toString();
}