@java.lang.Override
public java.io.OutputStream getOutputStream(java.lang.String relativePath, boolean mustExist, boolean closeSession) {
    com.jcraft.jsch.Session session = null;
    com.jcraft.jsch.ChannelSftp sftp = null;
    try {
        session = openSession();
        sftp = openConnectedChannel(org.jumpmind.metl.core.runtime.resource.SftpDirectory.CHANNEL_OUT);
        sftp.cd(basePath);
        createRelativePathDirectoriesIfNecessary(sftp, relativePath, mustExist);
        return new org.jumpmind.metl.core.runtime.resource.SftpDirectory.CloseableOutputStream(sftp.put(relativePath, ChannelSftp.OVERWRITE), session, sftp, closeSession);
    } catch (java.lang.Exception e) {
        throw new org.jumpmind.exception.IoException(e);
    }
}