private void setPermissionInt(java.lang.String src, org.apache.hadoop.fs.permission.FsPermission permission) throws io.hops.exception.StorageException, java.io.FileNotFoundException, java.io.IOException, org.apache.hadoop.hdfs.server.namenode.SafeModeException, org.apache.hadoop.hdfs.server.namenode.UnresolvedLinkException, org.apache.hadoop.security.AccessControlException {
    org.apache.hadoop.hdfs.protocol.HdfsFileStatus resultingStat = null;
    org.apache.hadoop.hdfs.server.namenode.FSPermissionChecker pc = getPermissionChecker();
    if (isInSafeMode()) {
        throw new org.apache.hadoop.hdfs.server.namenode.SafeModeException(("Cannot set permission for " + src), safeMode);
    }
    checkOwner(pc, src);
    dir.setPermission(src, permission);
    resultingStat = getAuditFileInfo(src, false);
    logAuditEvent(true, "setPermission", src, null, resultingStat);
}