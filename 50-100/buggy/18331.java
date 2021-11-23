private hudson.model.AbstractBuild<?, ?> findFirstBuildWithJumble(hudson.model.AbstractProject<?, ?> project2) {
    hudson.model.AbstractBuild<?, ?> build = project.getFirstBuild();
    while ((lookupReportFor(build)) == null) {
        build = build.getNextBuild();
    } 
    return build;
}