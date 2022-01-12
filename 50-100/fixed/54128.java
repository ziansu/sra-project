public boolean isExcluded(java.lang.String exclusion, java.lang.String... matchAgainst) {
    final java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(exclusion, java.util.regex.Pattern.CASE_INSENSITIVE);
    for (java.lang.String against : matchAgainst) {
        if (against != null) {
            java.util.regex.Matcher matcher = pattern.matcher(against);
            if (matcher.matches()) {
                return true;
            }
        }
    }
    return false;
}