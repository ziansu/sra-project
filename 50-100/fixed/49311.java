@java.lang.Override
public za.org.grassroot.services.Group mergeGroupsSpecifyOrder(za.org.grassroot.services.Group groupInto, za.org.grassroot.services.Group groupFrom, boolean setFromGroupInactive) {
    for (za.org.grassroot.services.User user : new java.util.ArrayList(groupFrom.getGroupMembers())) {
        addGroupMember(groupInto, user);
    }
    groupFrom.setActive((!setFromGroupInactive));
    saveGroup(groupFrom, true, java.lang.String.format("Set group %d inactive", groupFrom.getId()), dontKnowTheUser);
    return saveGroup(groupInto, true, java.lang.String.format("Merged group %d into %d", groupFrom.getId(), groupInto.getId()), dontKnowTheUser);
}