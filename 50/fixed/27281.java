public java.lang.String prepareStorage(java.lang.String fileName) {
    storageIO = new StorageIO();
    java.lang.String filePath = storageIO.setFilePath(fileName);
    storageIO.getDataFromFile(tasks);
    return java.lang.String.format(Constants.MESSAGE_WELCOME, filePath);
}