public static alluxio.client.file.options.CompleteUfsFileOptions defaults() {
    alluxio.security.authorization.PermissionStatus ps = alluxio.security.authorization.PermissionStatus.defaults();
    try {
        ps.setUserFromLoginModule(alluxio.client.ClientContext.getConf()).applyFileUMask(alluxio.client.ClientContext.getConf());
    } catch (java.io.IOException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
    alluxio.client.file.options.CompleteUfsFileOptions.LOG.info("CompleteUfsFileOptions ps = {} ", ps.toString());
    return new alluxio.client.file.options.CompleteUfsFileOptions(ps.getUserName(), ps.getGroupName(), java.lang.String.valueOf(ps.getPermission().toShort()));
}