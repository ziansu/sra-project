public void updateProfileByIdentifier(com.mikepenz.materialdrawer.model.interfaces.IProfile newProfile) {
    if ((mAccountHeaderBuilder.mProfiles) != null) {
        for (com.mikepenz.materialdrawer.model.interfaces.IProfile profile : mAccountHeaderBuilder.mProfiles) {
            if (profile instanceof com.mikepenz.materialdrawer.model.interfaces.Identifyable) {
                if ((profile.getIdentifier()) == (newProfile.getIdentifier())) {
                    profile = newProfile;
                    mAccountHeaderBuilder.updateHeaderAndList();
                    return ;
                }
            }
        }
    }
}