private void createRemoteParentDirsIfNotExists(java.lang.String parentDirPath) throws com.jcraft.jsch.SftpException {
    channelSftp.cd("/");
    java.lang.String[] folders = parentDirPath.split("/");
    for (java.lang.String folder : folders) {
        if ((folder.length()) > 0) {
            try {
                channelSftp.cd(folder);
            } catch (com.jcraft.jsch.SftpException e) {
                channelSftp.mkdir(folder);
                channelSftp.cd(folder);
            }
        }
    }
}