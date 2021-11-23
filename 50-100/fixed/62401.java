@java.lang.Override
public java.util.List<org.apache.maven.model.Profile> getActiveProfiles(java.util.Collection<org.apache.maven.model.Profile> profiles, org.apache.maven.model.profile.ProfileActivationContext context, org.apache.maven.model.building.ModelProblemCollector problems) {
    org.apache.maven.model.profile.ProfileSelector selector = selectors.get(context);
    if (selector == null) {
        selector = factory.createProfileSelector();
        selectors.put(context, selector);
    }
    return selector.getActiveProfiles(profiles, context, problems);
}