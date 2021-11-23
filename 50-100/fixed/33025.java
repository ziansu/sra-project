public synchronized java.util.Collection<jenkins.plugins.rootcause.RootCauseAction.RootCause> getCauses() {
    if ((causes) == null) {
        java.util.HashMap<jenkins.plugins.rootcause.RootCauseAction.RootCause, jenkins.plugins.rootcause.RootCauseAction.RootCause> rootCauses = new java.util.HashMap<jenkins.plugins.rootcause.RootCauseAction.RootCause, jenkins.plugins.rootcause.RootCauseAction.RootCause>();
        collectRootCauses(rootCauses, run);
        causes = rootCauses.values();
    }
    return causes;
}