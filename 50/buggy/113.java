public static void setActiveProfile(edu.chl.LifeOfAGoblin.model.profile.Profile profile) {
    if ((edu.chl.LifeOfAGoblin.model.profile.Profile.activeProfile) != null) {
        edu.chl.LifeOfAGoblin.model.profile.Profile.activeProfile.setIsActiveProfile(false);
    }
    edu.chl.LifeOfAGoblin.model.profile.Profile.activeProfile = profile;
    edu.chl.LifeOfAGoblin.model.profile.Profile.activeProfile.setIsActiveProfile(true);
}