public void apply(org.gradle.tooling.composite.GradleDistributionAware connector) {
    com.google.common.base.Preconditions.checkNotNull(connector);
    if ((this.localInstallationDir) != null) {
        connector.useInstallation(this.localInstallationDir);
    }else
        if ((this.remoteDistributionUri) != null) {
            connector.useDistribution(this.remoteDistributionUri);
        }else
            if ((this.version) != null) {
                connector.useGradleVersion(this.version);
            }
        
    
}