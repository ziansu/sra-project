public boolean setDirectory(java.lang.String new_path) {
    boolean success;
    byte[] content = getFileInBytes(storage.api.StorageController.DEFAULT_FILE_NAME);
    success = writeBytesToFile(storage.api.StorageController.CONFIG_FILE, new_path.getBytes(), false);
    if (success) {
        success = writeBytesToFile(storage.api.StorageController.DEFAULT_FILE_NAME, content, true);
    }else {
        return success;
    }
    storage.api.StorageController.DEFAULT_FILE_NAME = new_path;
    return success;
}