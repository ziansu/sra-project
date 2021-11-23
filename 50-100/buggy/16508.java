public org.json.simple.JSONObject getData() {
    initialise();
    org.json.simple.JSONObject dataJSON = new org.json.simple.JSONObject();
    if ((isStorageExist(getStorageRelativePath())) == true) {
        Storage.StorageDatastore.logger.log(java.util.logging.Level.INFO, Storage.StorageDatastore.MESSAGE_GET_ALL_DATA_STORAGE_EXIST);
        dataJSON = retrieveDataFromStorage();
    }else {
        Storage.StorageDatastore.logger.log(java.util.logging.Level.WARNING, Storage.StorageDatastore.MESSAGE_GET_ALL_DATA_STORAGE_NOT_EXIST);
    }
    return dataJSON;
}