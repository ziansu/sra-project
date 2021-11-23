public com.erikcarlsten.messenger.model.Profile updateProfile(com.erikcarlsten.messenger.model.Profile profile) {
    if (profile.getProfileName().isEmpty()) {
        return null;
    }
    profiles.put(profile.getProfileName(), profile);
    return profile;
}