private void initProfiles(android.view.SubMenu profilesMenu) {
    profilesMenu.clear();
    for (int i = 0; i < (Profiles.profilesList.size()); i++) {
        profilesMenu.add(Profiles.profilesList.get(i).header).setIcon(R.drawable.sent);
    }
}