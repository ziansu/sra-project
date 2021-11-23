private hudson.plugins.cigame.model.RuleResult<java.lang.Integer> evaluateMaven(hudson.model.AbstractBuild<?, ?> previousBuild, hudson.model.AbstractBuild<?, ?> build) {
    java.util.List<hudson.plugins.findbugs.FindBugsMavenResultAction> currentActions = hudson.plugins.cigame.util.ActionRetriever.getResult(build, Result.UNSTABLE, hudson.plugins.findbugs.FindBugsMavenResultAction.class);
    if (currentActions.isEmpty()) {
        return null;
    }
    int currentAnnotations = getNumberOfMavenAnnotations(currentActions);
    java.util.List<hudson.plugins.findbugs.FindBugsMavenResultAction> previousActions = hudson.plugins.cigame.util.ActionRetriever.getResult(previousBuild, Result.UNSTABLE, hudson.plugins.findbugs.FindBugsMavenResultAction.class);
    int previousAnnotations = getNumberOfMavenAnnotations(previousActions);
    return evaluate(previousAnnotations, currentAnnotations);
}