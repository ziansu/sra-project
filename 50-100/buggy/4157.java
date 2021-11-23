private java.lang.Object readResolve() {
    if ((includeRegex) != null) {
        try {
            includePattern = java.util.regex.Pattern.compile(includeRegex);
        } catch (java.util.regex.PatternSyntaxException x) {
            includeRegex = null;
            hudson.diagnosis.OldDataMonitor.report(this, java.util.Collections.<java.lang.Throwable>singleton(x));
        }
    }
    if ((jobNames) == null) {
        jobNames = new java.util.TreeSet<java.lang.String>(hudson.util.CaseInsensitiveComparator.INSTANCE);
    }
    initColumns();
    initJobFilters();
    return this;
}