void addGroup(io.hops.metadata.hdfs.entity.Group group) {
    if (group == null)
        return ;
    
    idsToGroups.putIfAbsent(group.getId(), group.getName());
    groupsToIds.putIfAbsent(group.getName(), group.getId());
    groupsToUsers.putIfAbsent(group.getName(), new java.util.ArrayList<java.lang.String>());
}