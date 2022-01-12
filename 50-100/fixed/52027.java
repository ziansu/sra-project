public it.smartcommunitylab.parking.management.web.model.UserSetting findUserByUsername(java.lang.String username) {
    usersMap = new java.util.HashMap<java.lang.String, it.smartcommunitylab.parking.management.web.model.UserSetting>();
    for (it.smartcommunitylab.parking.management.web.model.UserSetting user : users) {
        usersMap.put(user.getUsername(), user);
    }
    return usersMap.get(username);
}