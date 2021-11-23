private void createSymlinkInt(java.lang.String target, java.lang.String link, org.apache.hadoop.fs.permission.PermissionStatus dirPerms, boolean createParent) throws io.hops.exception.StorageException, java.io.IOException, org.apache.hadoop.hdfs.server.namenode.UnresolvedLinkException {
    org.apache.hadoop.hdfs.protocol.HdfsFileStatus resultingStat = null;
    org.apache.hadoop.hdfs.server.namenode.FSPermissionChecker pc = getPermissionChecker();
    if (!createParent) {
        verifyParentDir(link);
    }
    createSymlinkInternal(pc, target, link, dirPerms, createParent);
    resultingStat = getAuditFileInfo(link, false);
    logAuditEvent(true, "createSymlink", link, target, resultingStat);
}