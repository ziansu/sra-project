public void create() {
    transactionBlobStore = new org.locationtech.geogig.storage.TransactionBlobStoreImpl(((org.locationtech.geogig.storage.TransactionBlobStore) (context.blobStore())), transactionId);
    transactionRefDatabase.create();
}