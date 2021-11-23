private static java.lang.String getQueryString(java.util.List<java.lang.String> stringQueries) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (java.lang.String query : stringQueries) {
        builder.append(query.trim()).append(";");
    }
    return builder.toString();
}