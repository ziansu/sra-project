public com.rezzedup.parrot.api.profiles.SpamProfile getProfile(java.lang.String group, java.lang.String name) {
    com.rezzedup.parrot.profiles.ProfileGroup profiles = getGroup(group);
    if (group == null) {
        return null;
    }
    return profiles.getProfile(name);
}