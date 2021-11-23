public org.duracloud.client.ContentStore getPrimaryContentStoreAsAnonymous() throws org.duracloud.error.ContentStoreException {
    return getPrimaryContentStore((-1));
}