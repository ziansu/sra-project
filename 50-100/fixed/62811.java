protected void addIssuesFromDependentBuilds(hudson.model.Run<?, ?> build, hudson.plugins.jira.JiraSite site, hudson.model.TaskListener listener, java.util.Set<java.lang.String> issueIds) {
    for (hudson.model.AbstractBuild.DependencyChange depc : hudson.plugins.jira.RunScmChangeExtractor.getDependencyChanges(build).values()) {
        for (hudson.model.AbstractBuild<?, ?> b : depc.getBuilds()) {
            getLogger().finer(((("Searching for JIRA issues in dependency " + b) + " of ") + build));
            addIssuesRecursive(b, site, listener, issueIds);
        }
    }
}