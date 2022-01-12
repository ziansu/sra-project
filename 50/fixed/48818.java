@javax.annotation.CheckForNull
private static java.util.List<java.lang.String> sanitizeScmAccounts(@javax.annotation.Nullable
java.util.List<java.lang.String> scmAccounts) {
    if (scmAccounts != null) {
        scmAccounts.removeAll(java.util.Arrays.asList(null, ""));
    }
    return scmAccounts;
}