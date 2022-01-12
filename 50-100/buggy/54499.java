public boolean setPath(java.lang.String pathName) {
    java.util.Properties storageProperties = storageLoad.loadProperties();
    boolean setStatus = false;
    if (isFilePathValid(pathName)) {
        if (isKeyChanged(pathName)) {
            setStatus = copyToNewLocation();
            deleteResidualDirectory();
        }
    }
    storageSave.saveProperties(storageProperties);
    return setStatus;
}