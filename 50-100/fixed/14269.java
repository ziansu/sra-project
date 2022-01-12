public void apply(org.gradle.tooling.composite.GradleDistributionAware target) {
    com.google.common.base.Preconditions.checkNotNull(target);
    if ((this.localInstallationDir) != null) {
        target.useInstallation(this.localInstallationDir);
    }else
        if ((this.remoteDistributionUri) != null) {
            target.useDistribution(this.remoteDistributionUri);
        }else
            if ((this.version) != null) {
                target.useGradleVersion(this.version);
            }
        
    
}