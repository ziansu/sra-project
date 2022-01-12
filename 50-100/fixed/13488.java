@java.lang.Override
public java.util.List<org.apache.maven.model.Profile> getActiveProfiles(java.util.Collection<org.apache.maven.model.Profile> availableProfiles, org.apache.maven.model.profile.ProfileActivationContext context, org.apache.maven.model.building.ModelProblemCollector problems) {
    java.util.List<org.apache.maven.model.Profile> activatedProfiles = getActivatedProfiles(availableProfiles, context, problems);
    if (activatedProfiles.isEmpty()) {
        activatedProfiles = getActiveByDefaultProfiles(availableProfiles, context, problems);
    }
    return activatedProfiles;
}