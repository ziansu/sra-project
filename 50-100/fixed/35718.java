boolean include(java.lang.String s, boolean isNode) {
    if (((!isNode) && (appliesToAtomic)) || (isNode && (appliesToCollection))) {
        if ((wildCardPattern.matcher(s).matches()) && (regexPattern.matcher(s).matches())) {
            return !(excludeMatching);
        }else {
            return excludeMatching;
        }
    }
    return true;
}