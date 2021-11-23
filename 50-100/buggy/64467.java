public static java.util.List<com.kylantraynor.civilizations.groups.Group> getGroupList() {
    com.kylantraynor.civilizations.Civilizations.DEBUG("Getting Groups from Cache.");
    if ((com.kylantraynor.civilizations.Cache.groupListChanged) || ((com.kylantraynor.civilizations.Cache.groupList) == null)) {
        com.kylantraynor.civilizations.Civilizations.DEBUG("Groups list needs update. Updating... ");
        com.kylantraynor.civilizations.Cache.groupListChanged = false;
        com.kylantraynor.civilizations.Cache.groupList = new java.util.ArrayList<com.kylantraynor.civilizations.groups.Group>();
        for (com.kylantraynor.civilizations.groups.Group g : com.kylantraynor.civilizations.groups.Group.getList()) {
            com.kylantraynor.civilizations.Cache.groupList.add(g);
        }
    }
    com.kylantraynor.civilizations.Civilizations.DEBUG((("Returning a list of " + (com.kylantraynor.civilizations.Cache.groupList.size())) + " groups."));
    return com.kylantraynor.civilizations.Cache.groupList;
}