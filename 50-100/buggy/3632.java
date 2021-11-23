protected java.util.Set<org.jasig.portal.groups.IEntityGroup> primGetAncestorGroups(org.jasig.portal.groups.IGroupMember member, java.util.Set<org.jasig.portal.groups.IEntityGroup> rslt) throws org.jasig.portal.groups.GroupsException {
    for (org.jasig.portal.groups.IEntityGroup group : getParentGroups()) {
        if (!(rslt.contains(group))) {
            rslt.add(group);
            primGetAncestorGroups(group, rslt);
        }
    }
    return rslt;
}