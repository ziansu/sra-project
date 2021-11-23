private void deleteResidualDirectory() {
    java.util.Properties storageProperties = storageLoad.loadProperties();
    java.lang.String oldFileDirPath = storageProperties.getProperty(org.jimple.planner.Constants.PROPERTIES_KEY_PREV_SAVEPATH);
    oldFileDirPath = getFullFilePath(oldFileDirPath, org.jimple.planner.Constants.DEFAULT_FILE_DIRECTORY);
    if (!(oldFileDirPath.equals(org.jimple.planner.Constants.PROPERTIES_SAVEPATH_TO_CWD))) {
        java.io.File oldFileDir = new java.io.File(oldFileDirPath);
        if (oldFileDir.isDirectory()) {
            oldFileDir.delete();
        }
    }
}