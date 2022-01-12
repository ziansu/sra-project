public static java.lang.Integer sizeFile(java.lang.String user, java.lang.String pwd, java.lang.String remotePath, java.lang.String knoxurl) {
    java.io.InputStream input = null;
    java.lang.Integer size = null;
    try {
        org.apache.hadoop.security.UserGroupInformation ugi = org.apache.hadoop.security.UserGroupInformation.createRemoteUser(user);
        input = ugi.doAs(new org.csi.yucca.dataservice.ingest.binary.webhdfs.ReadFileHdfsAction(user, pwd, remotePath, knoxurl));
        size = input.available();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        org.apache.commons.io.IOUtils.closeQuietly(input);
    }
    return size;
}