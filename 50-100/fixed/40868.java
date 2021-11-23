public long getEntryCount(java.lang.String filter) {
    if (isAdmin) {
        return dao.getAllEntryCount(filter);
    }
    java.util.Set<org.jbei.ice.storage.model.Group> accountGroups = new java.util.HashSet(account.getGroups());
    accountGroups.add(everybodyGroup);
    return dao.visibleEntryCount(account, accountGroups, filter);
}