public java.util.Properties getProfileProperties(java.lang.String profileId) {
    if (profileId == null) {
        throw new java.lang.IllegalArgumentException("profileId is null");
    }
    for (org.apache.maven.model.Profile profile : getRawModel().getProfiles()) {
        if (profileId.equals(profile.getId())) {
            return profile.getProperties();
        }
    }
    throw new java.lang.IllegalArgumentException((("profile [" + profileId) + "] not found"));
}