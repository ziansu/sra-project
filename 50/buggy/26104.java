public java.lang.String getNewStorageAccountName() {
    if (((org.apache.commons.lang.StringUtils.isBlank(newStorageAccountName)) && (org.apache.commons.lang.StringUtils.isBlank(existStorageAccountName))) && (org.apache.commons.lang.StringUtils.isNotBlank(storageAccountName))) {
        newStorageAccountName = storageAccountName;
    }
    return newStorageAccountName;
}