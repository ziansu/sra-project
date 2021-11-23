private static java.util.Set<java.lang.String> getFunctionAliases(java.lang.String query) {
    java.util.Set<java.lang.String> result = new java.util.HashSet<java.lang.String>();
    java.util.regex.Matcher matcher = org.springframework.data.jpa.repository.query.QueryUtils.FUNCTION_PATTERN.matcher(query);
    while (matcher.find()) {
        java.lang.String alias = matcher.group(org.springframework.data.jpa.repository.query.QueryUtils.FUNCTION_ALIAS_GROUP_NAME);
        if (org.springframework.util.StringUtils.hasText(alias)) {
            result.add(alias);
        }
    } 
    return result;
}