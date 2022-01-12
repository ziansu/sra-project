private java.lang.String queryToString() {
    java.lang.StringBuilder queryStringBuilder = new java.lang.StringBuilder();
    query.forEach(( param, value) -> queryStringBuilder.append((((param + "=") + value) + "&")));
    java.lang.String queryString = queryStringBuilder.toString();
    return queryString.substring(0, ((queryString.length()) - 1));
}