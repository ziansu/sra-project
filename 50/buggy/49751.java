private boolean matchesList(java.lang.String path, java.util.List<java.lang.String> list, boolean matchAllSegments) {
    for (java.lang.String pattern : list) {
        return matches(pattern, path, matchAllSegments);
    }
    return false;
}