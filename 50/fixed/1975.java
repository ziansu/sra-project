protected boolean isValidQuery(java.lang.String query) {
    if (query == null) {
        return true;
    }
    return UrlValidator.QUERY_PATTERN.matcher(query).matches();
}