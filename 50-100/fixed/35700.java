public com.spectralogic.ds3client.commands.PutObjectRequest withMetaData(final java.lang.String key, final java.lang.String value) {
    if (com.spectralogic.ds3client.utils.Guard.isStringNullOrEmpty(value)) {
        com.spectralogic.ds3client.commands.PutObjectRequest.LOG.warn("Key has not been added to metadata because value was null or empty: {}", key);
        return this;
    }
    final java.lang.String modifiedKey;
    if (!(key.toLowerCase().startsWith(com.spectralogic.ds3client.commands.PutObjectRequest.AMZ_META_HEADER))) {
        modifiedKey = (com.spectralogic.ds3client.commands.PutObjectRequest.AMZ_META_HEADER) + (key.toLowerCase());
    }else {
        modifiedKey = key;
    }
    this.getHeaders().put(modifiedKey, value);
    return this;
}