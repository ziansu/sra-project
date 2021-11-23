static void setVersion(hudson.model.AbstractBuild build, java.lang.String version) {
    se.diabol.jenkins.pipeline.PipelineVersionContributor.PipelineVersionAction action = build.getAction(se.diabol.jenkins.pipeline.PipelineVersionContributor.PipelineVersionAction.class);
    if (action == null) {
        build.addAction(new se.diabol.jenkins.pipeline.PipelineVersionContributor.PipelineVersionAction(version));
    }else {
        build.replaceAction(action);
    }
    build.replaceAction(se.diabol.jenkins.pipeline.PipelineVersionContributor.getVersionParameterAction(build, version));
}