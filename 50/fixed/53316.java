private hudson.jumble.ReportBuildAction lookupJumbleAction(hudson.model.AbstractBuild<?, ?> build) {
    hudson.jumble.ReportBuildAction action = null;
    if (build != null) {
        action = build.getAction(hudson.jumble.ReportBuildAction.class);
    }
    return action;
}