@java.lang.Override
public java.util.List<org.apache.maven.model.Profile> getActiveProfiles(java.util.Collection<org.apache.maven.model.Profile> availableProfiles, org.apache.maven.model.profile.ProfileActivationContext context, org.apache.maven.model.building.ModelProblemCollector problems) {
    com.github.sviperll.maven.profiledep.StrongDefaultActivationProfileSelector.logger.log(java.util.logging.Level.FINE, "{0}.getActiveProfiles(?, '{'inactiveProfileIds = {1}, activeProfileIds = {2}'}', ?)", new java.lang.Object[]{ com.github.sviperll.maven.profiledep.StrongDefaultActivationProfileSelector.class.getSimpleName() , context.getInactiveProfileIds() , context.getActiveProfileIds() });
    java.util.List<org.apache.maven.model.Profile> activatedProfiles = getActivatedProfiles(availableProfiles, context, problems);
    if (activatedProfiles.isEmpty()) {
        activatedProfiles = getActiveByDefaultProfiles(availableProfiles, context, problems);
    }
    return activatedProfiles;
}