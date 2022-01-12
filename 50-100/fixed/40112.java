public static java.lang.String formatCommaSeparatedList(java.util.List<java.lang.String> list) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (int i = 0; i < (list.size()); i++) {
        if (i != 0) {
            builder.append(",");
        }
        builder.append(list.get(i));
    }
    return builder.toString();
}