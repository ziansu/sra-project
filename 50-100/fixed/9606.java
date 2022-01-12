@java.lang.Override
public void deleteCorsRules(@javax.annotation.Nonnull
java.lang.String bucketUuid) throws com.eucalyptus.objectstorage.exceptions.ObjectStorageException {
    try (final com.eucalyptus.entities.TransactionResource tran = com.eucalyptus.entities.Entities.transactionFor(com.eucalyptus.objectstorage.entities.CorsRule.class)) {
        com.eucalyptus.objectstorage.BucketCorsManagers.getInstance().deleteCorsRules(bucketUuid, tran);
        tran.commit();
    } catch (java.lang.Exception ex) {
        com.eucalyptus.objectstorage.metadata.DbBucketCorsManagerImpl.LOG.error(("Exception caught while deleting CORS rules for bucket " + bucketUuid), ex);
        throw new com.eucalyptus.objectstorage.exceptions.ObjectStorageException("InternalServerError", ("Exception caught while deleting CORS rules for bucket " + bucketUuid), "Bucket", bucketUuid, org.jboss.netty.handler.codec.http.HttpResponseStatus.INTERNAL_SERVER_ERROR);
    }
}