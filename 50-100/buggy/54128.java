public boolean isExcluded(java.lang.String exclusion, java.lang.String... matchAgainst) {
    if (matchAgainst == null) {
        return false;
    }
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(exclusion, java.util.regex.Pattern.CASE_INSENSITIVE);
    for (java.lang.String against : matchAgainst) {
        if (against != null) {
            java.util.regex.Matcher matcher = p.matcher(against);
            if (matcher.matches()) {
                return true;
            }
        }
    }
    return false;
}