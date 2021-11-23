protected org.payn.chsm.Behavior getBehaviorFromResource(java.lang.String resourceName, java.lang.String behaviorName) throws java.lang.Exception {
    org.payn.chsm.Resource resource = resourceMap.get(resourceName);
    if (resourceName == null) {
        throw new java.lang.Exception(java.lang.String.format("Resource %s was not installed.", resourceName));
    }
    org.payn.chsm.Behavior behavior;
    try {
        behavior = resource.getBehavior(behaviorName);
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception(((("Error loading behavior " + behaviorName) + " from resource ") + resourceName), e);
    }
    return behavior;
}