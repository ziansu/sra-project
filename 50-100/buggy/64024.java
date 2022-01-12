public java.util.Set<com.mapchat.entitypackage.Groups> getNonGlobalGroups() {
    java.util.List<com.mapchat.entitypackage.UserGroup> usergroups = userGroupFacade.findByUserId(profileViewManager.getLoggedInUser().getId());
    if (usergroups == null) {
        return null;
    }
    for (com.mapchat.entitypackage.UserGroup ug : usergroups) {
        java.lang.String name = groupsFacade.getGroup(ug.getGroupId()).getGroupName();
        nonGlobalGroups.add(groupsFacade.getGroup(ug.getGroupId()));
        java.lang.System.out.println(("group name: " + name));
    }
    return nonGlobalGroups;
}