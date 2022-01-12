@java.lang.Override
public java.util.List<org.apache.maven.model.Profile> getActiveProfiles(java.util.Collection<org.apache.maven.model.Profile> profiles, org.apache.maven.model.profile.ProfileActivationContext context, org.apache.maven.model.building.ModelProblemCollector problems) {
    com.github.sviperll.maven.profiledep.MultipleContextsProfileSelector.logger.log(java.util.logging.Level.FINE, "{0}.getActiveProfiles(?, {1}, ?)", new java.lang.Object[]{ com.github.sviperll.maven.profiledep.MultipleContextsProfileSelector.class.getSimpleName() , context });
    org.apache.maven.model.profile.ProfileSelector selector = selectors.get(context);
    if (selector == null) {
        selector = factory.createProfileSelector();
        selectors.put(context, selector);
    }
    return selector.getActiveProfiles(profiles, context, problems);
}