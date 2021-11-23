public void addUserProfile(dk.magenta.datafordeler.core.user.UserProfile userprofile) {
    this.userProfiles.put(userprofile.getName(), userprofile);
    for (java.lang.String systemRole : userprofile.getSystemRoles()) {
        if (systemRoles.containsKey(systemRole)) {
            systemRoles.get(systemRole).add(userprofile);
        }else {
            systemRoles.put(systemRole, java.util.Collections.singletonList(userprofile));
        }
    }
}