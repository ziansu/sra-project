void addUser(io.hops.metadata.hdfs.entity.User user) {
    if (user == null)
        return ;
    
    idsToUsers.putIfAbsent(user.getId(), user.getName());
    usersToIds.putIfAbsent(user.getName(), user.getId());
}