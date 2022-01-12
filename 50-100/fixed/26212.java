private java.util.Set<org.eclipse.buildship.core.configuration.BuildConfiguration> createBuildConfigsFor(java.util.Set<org.eclipse.core.resources.IProject> projects) {
    java.util.Set<org.eclipse.buildship.core.configuration.BuildConfiguration> buildConfigs = com.google.common.collect.Sets.newLinkedHashSet();
    for (org.eclipse.core.resources.IProject project : projects) {
        buildConfigs.add(org.eclipse.buildship.core.CorePlugin.configurationManager().createBuildConfiguration(project.getLocation().toFile(), false, com.gradleware.tooling.toolingclient.GradleDistribution.fromBuild(), null, false, false));
    }
    return buildConfigs;
}