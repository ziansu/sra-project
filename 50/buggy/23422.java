public java.util.List<hudson.plugins.git.GitStatus.ResponseContributor> onNotifyCommit(org.eclipse.jgit.transport.URIish uri, @edu.umd.cs.findbugs.annotations.Nullable
java.lang.String sha1, java.lang.String... branches) {
    java.util.List<hudson.plugins.git.ParameterValue> buildParameters = java.util.Collections.EMPTY_LIST;
    return onNotifyCommit(uri, sha1, buildParameters, branches);
}