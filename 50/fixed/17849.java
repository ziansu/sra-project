public byte[] getOrder(java.lang.String id) {
    if ((checkStatus(id)) == (com.github.ukase.bulk.BulkStatus.PROCESSED)) {
        return getFileData(id);
    }
    return null;
}