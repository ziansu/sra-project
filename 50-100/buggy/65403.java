public boolean match(java.lang.String resource, int line) {
    if (line < (matches.length)) {
        java.util.Set set = matches[line];
        if (set != null) {
            return set.contains(resource);
        }
    }
    return false;
}