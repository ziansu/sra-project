public java.lang.String getLastBuildNode(hudson.model.Job<?, ?> job) {
    hudson.model.Run<?, ?> lastBuild = job.getLastBuild();
    if (lastBuild instanceof hudson.model.AbstractBuild<?, ?>) {
        hudson.model.Node builtOn = ((hudson.model.AbstractBuild<?, ?>) (lastBuild)).getBuiltOn();
        if (builtOn instanceof jenkins.model.Jenkins) {
            return "master";
        }
        return builtOn.getDisplayName();
    }
    return null;
}