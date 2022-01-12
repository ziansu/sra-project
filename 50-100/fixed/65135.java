public boolean enabled(java.lang.String... cats) {
    for (java.lang.String cat : cats) {
        if ((cat == null) || ((cat.trim().length()) < 1)) {
            continue;
        }
        if (cat.equals(enabled)) {
            return true;
        }
        if (((pattern) != null) && (pattern.matcher(cat).matches())) {
            return true;
        }
    }
    return false;
}