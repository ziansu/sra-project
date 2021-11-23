void addGroup(io.hops.metadata.hdfs.entity.Group group) {
    idsToGroups.putIfAbsent(group.getId(), group.getName());
    groupsToIds.putIfAbsent(group.getName(), group.getId());
    groupsToUsers.putIfAbsent(group.getName(), new java.util.ArrayList<java.lang.String>());
}