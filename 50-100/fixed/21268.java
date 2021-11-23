public javax.ws.rs.core.Response downloadFile(java.lang.String fileName, java.lang.String user, boolean isDaemon) throws java.io.IOException {
    java.lang.String rootDir = (isDaemon) ? daemonLogRoot : logRoot;
    java.io.File file = new java.io.File(rootDir, fileName).getCanonicalFile();
    if (file.exists()) {
        if (isDaemon || (resourceAuthorizer.isUserAllowedToAccessFile(user, fileName))) {
            return org.apache.storm.daemon.logviewer.utils.LogviewerResponseBuilder.buildDownloadFile(file);
        }else {
            return org.apache.storm.daemon.logviewer.utils.LogviewerResponseBuilder.buildResponseUnautohrizedUser(user);
        }
    }else {
        return org.apache.storm.daemon.logviewer.utils.LogviewerResponseBuilder.buildResponsePageNotFound();
    }
}