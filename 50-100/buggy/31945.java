public it.smartcommunitylab.parking.management.web.model.UserSetting findUserById(java.lang.String id) {
    if ((usersMap) == null) {
        usersMap = new java.util.HashMap<java.lang.String, it.smartcommunitylab.parking.management.web.model.UserSetting>();
        for (it.smartcommunitylab.parking.management.web.model.UserSetting user : users) {
            usersMap.put(user.getId(), user);
        }
    }
    return usersMap.get(id);
}