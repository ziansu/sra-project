public void addUserProfile(dk.magenta.datafordeler.core.user.UserProfile userprofile) {
    this.userProfiles.put(userprofile.getName(), userprofile);
    for (java.lang.String systemRole : userprofile.getSystemRoles()) {
        if (systemRoles.containsKey(systemRole)) {
            systemRoles.get(systemRole).add(userprofile);
        }else {
            java.util.ArrayList<dk.magenta.datafordeler.core.user.UserProfile> list = new java.util.ArrayList<>();
            list.add(userprofile);
            systemRoles.put(systemRole, list);
        }
    }
}