@java.lang.Override
public synchronized org.springframework.cloud.config.server.environment.Locations getLocations(java.lang.String application, java.lang.String profile, java.lang.String label) {
    if (label == null) {
        label = this.defaultLabel;
    }
    java.lang.String version = refresh(application, label);
    return new org.springframework.cloud.config.server.environment.Locations(application, profile, label, version, getSearchLocations(getWorkingDirectory(), application, profile, label));
}