public boolean setPath(java.lang.String pathName) {
    java.util.Properties storageProperties = storageLoad.loadProperties();
    boolean setStatus = false;
    if (isFilePathValid(pathName)) {
        if (isKeyChanged(pathName, storageProperties)) {
            setStatus = copyToNewLocation(storageProperties);
            deleteResidualDirectory(storageProperties);
        }
    }
    storageSave.saveProperties(storageProperties);
    return setStatus;
}