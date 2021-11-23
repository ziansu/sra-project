private java.util.Iterator<org.jasig.portal.groups.IEntityGroup> findContainingGroupsForGroup(org.jasig.portal.groups.IEntityGroup group) {
    logger.debug("Finding containing groups for group {} (key {})", group.getName(), group.getKey());
    java.util.Set<org.jasig.portal.groups.IEntityGroup> parents = getContainingGroups(group.getName(), new java.util.HashSet<org.jasig.portal.groups.IEntityGroup>());
    return parents.iterator();
}