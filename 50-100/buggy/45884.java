public static java.lang.String getLogFilesFolder() throws qla.modules.actions.exeption.ActionException {
    java.lang.String pathToFolder = qla.modules.confuguration.AppConfiguration.getProperty("logfiles.folder");
    if (org.springframework.util.StringUtils.isEmpty(pathToFolder)) {
        throw new qla.modules.actions.exeption.ActionException("Path to logfiles folder did not configured!");
    }
    pathToFolder = (pathToFolder.endsWith(java.io.File.separator)) ? pathToFolder : pathToFolder + (java.io.File.pathSeparator);
    return pathToFolder;
}