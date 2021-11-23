public static long checkFileIdCompatibility(long fileId, int storageId) {
    if ((com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.extractStorageId(fileId)) == 0) {
        return com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.composeFileId(((int) (fileId)), storageId);
    }
    return fileId;
}