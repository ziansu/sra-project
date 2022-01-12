boolean include(java.lang.String s, boolean isNode) {
    if ((wildCardPattern.matcher(s).matches()) && (regexPattern.matcher(s).matches())) {
        if (((!isNode) && (appliesToAtomic)) || (isNode && (appliesToCollection))) {
            return !(excludeMatching);
        }
    }
    return excludeMatching;
}