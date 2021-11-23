public me.digi.examples.ca.Profile getProfile(java.lang.String name) {
    for (me.digi.examples.ca.Profile profile : profiles) {
        if (profile.getName().toLowerCase().equals(name))
            return profile;
        
    }
    return null;
}