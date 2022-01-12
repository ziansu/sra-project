private hudson.model.AbstractBuild<?, ?> findFirstBuildWithJumble(hudson.model.AbstractProject<?, ?> project) {
    hudson.model.AbstractBuild<?, ?> build = project.getFirstBuild();
    while ((build != null) && ((lookupReportFor(build)) == null)) {
        build = build.getNextBuild();
    } 
    return build;
}