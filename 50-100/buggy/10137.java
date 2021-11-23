@java.lang.Override
public void parseAssociatedNames(hudson.model.Job<?, ?> job, java.util.Collection<com.cloudbees.jenkins.GitHubRepositoryName> result) {
    jenkins.model.ParameterizedJobMixIn.ParameterizedJob p = ((jenkins.model.ParameterizedJobMixIn.ParameterizedJob) (job));
    for (com.cloudbees.jenkins.GitHubTrigger ght : hudson.Util.filter(p.getTriggers().values(), com.cloudbees.jenkins.GitHubTrigger.class)) {
        result.addAll(ght.getGitHubRepositories());
    }
}