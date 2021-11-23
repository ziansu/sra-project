public com.erikcarlsten.messenger.model.Profile updateProfile(com.erikcarlsten.messenger.model.Profile profile) {
    if ((profile.getId()) <= 0) {
        return null;
    }
    profiles.put(profile.getProfileName(), profile);
    return profile;
}