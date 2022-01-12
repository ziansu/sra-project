@javaposse.jobdsl.dsl.RequiresPlugin(id = "pretested-integration", minimumVersion = "2.3.0")
@javaposse.jobdsl.plugin.DslExtensionMethod(context = javaposse.jobdsl.dsl.helpers.wrapper.WrapperContext.class)
public java.lang.Object pretestedIntegration(java.lang.String strategy, java.lang.String branch, java.lang.String repository) {
    javaposse.jobdsl.dsl.Preconditions.checkArgument(strategies.contains(strategy), ("Strategy must be one of " + (strategies)));
    org.jenkinsci.plugins.pretestedintegration.IntegrationStrategy integrationStrategy = null;
    switch (strategy) {
        case "ACCUMULATED" :
            integrationStrategy = new org.jenkinsci.plugins.pretestedintegration.scm.git.AccumulatedCommitStrategy();
            break;
        case "SQUASHED" :
            integrationStrategy = new org.jenkinsci.plugins.pretestedintegration.scm.git.SquashCommitStrategy();
            break;
    }
    return new org.jenkinsci.plugins.pretestedintegration.PretestedIntegrationBuildWrapper(new org.jenkinsci.plugins.pretestedintegration.scm.git.GitBridge(integrationStrategy, branch, repository));
}