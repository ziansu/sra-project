private boolean containsOneOf(java.lang.String toCheck, java.lang.String... args) {
    for (java.lang.CharSequence arg : args) {
        if ((null != arg) && (toCheck.contains(arg))) {
            return true;
        }
    }
    return false;
}