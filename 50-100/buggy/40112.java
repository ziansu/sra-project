public static java.lang.String formatCommaSeparatedList(java.util.List<java.lang.String> list) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (java.lang.String s : list) {
        builder.append(s);
        builder.append(",");
    }
    if ((builder.length()) > 0) {
        builder.substring(0, ((builder.length()) - 1));
    }
    return builder.toString();
}