void unprotectedSetOwner(java.lang.String src, java.lang.String username, java.lang.String groupname) throws java.io.IOException {
    org.apache.hadoop.hdfs.server.namenode.INode inode = getRootDir().getNode(src, true);
    if (inode == null) {
        throw new java.io.FileNotFoundException(("File does not exist: " + src));
    }
    if (username != null) {
        inode.setUser(username);
    }
    if (groupname != null) {
        inode.setGroup(groupname);
    }
    io.hops.security.Users.addUserToGroup(username, groupname);
}