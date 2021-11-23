public long getEntryCount(java.lang.String filter) {
    if (isAdmin) {
        return dao.getAllEntryCount(filter);
    }
    java.util.Set<org.jbei.ice.storage.model.Group> accountGroups = new java.util.HashSet(account.getGroups());
    org.jbei.ice.lib.group.GroupController controller = new org.jbei.ice.lib.group.GroupController();
    org.jbei.ice.storage.model.Group everybodyGroup = controller.createOrRetrievePublicGroup();
    accountGroups.add(everybodyGroup);
    return dao.visibleEntryCount(account, accountGroups, filter);
}