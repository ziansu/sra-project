private static java.io.File createLocalDir(co.cask.cdap.common.conf.CConfiguration cConf, java.lang.String dirName) {
    java.lang.String localDirStr = cConf.get(Constants.Explore.LOCAL_DATA_DIR);
    java.io.File credentialsDir = new java.io.File(localDirStr, dirName);
    try {
        java.nio.file.Files.createDirectories(credentialsDir.toPath(), FileUtils.OWNER_ONLY_RWX);
    } catch (java.io.IOException ioe) {
        com.google.common.base.Throwables.propagate(ioe);
    }
    return credentialsDir;
}