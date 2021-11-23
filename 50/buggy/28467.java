private java.lang.String getFilterFileProjectRelativePath() {
    return getProject().findMember(de.tobject.findbugs.properties.test.FILTER_FILE).getProjectRelativePath().toOSString();
}