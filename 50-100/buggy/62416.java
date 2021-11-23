public io.github.xsocks.model.Profile firstCreate() {
    io.github.xsocks.model.Profile profile = new io.github.xsocks.model.Profile();
    profile = loadFromPreferences(profile);
    int nextId = (profiles.getMaxId()) + 1;
    if (nextId > 1)
        return profile;
    
    profile.setId(nextId);
    createProfile(profile);
    setPreferences(profile);
    return profile;
}