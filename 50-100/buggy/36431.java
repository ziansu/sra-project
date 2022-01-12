@java.lang.Override
public org.gradle.api.artifacts.Configuration findProjectConfiguration() {
    org.gradle.api.artifacts.ConfigurationContainer dependencyConfigurations = getDependencyProject().getConfigurations();
    java.lang.String declaredConfiguration = getTargetConfiguration();
    org.gradle.api.artifacts.Configuration selectedConfiguration = dependencyConfigurations.getByName(org.gradle.util.GUtil.elvis(declaredConfiguration, Dependency.DEFAULT_CONFIGURATION));
    if (!(selectedConfiguration.isCanBeConsumed())) {
        throw new org.gradle.internal.exceptions.ConfigurationNotConsumableException(declaredConfiguration);
    }
    return selectedConfiguration;
}