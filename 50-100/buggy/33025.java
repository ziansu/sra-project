public synchronized java.util.List<jenkins.plugins.rootcause.RootCauseAction.RootCause> getCauses() {
    if ((causes) == null) {
        java.util.List<jenkins.plugins.rootcause.RootCauseAction.RootCause> rootCauses = new java.util.ArrayList<jenkins.plugins.rootcause.RootCauseAction.RootCause>();
        collectRootCauses(rootCauses, new java.util.HashSet<java.lang.String>(), run);
        causes = rootCauses;
    }
    return causes;
}