public void deleteJobFiles(org.auscope.portal.core.cloud.CloudFileOwner job, java.lang.String arn, java.lang.String clientSecret) throws org.auscope.portal.core.services.PortalServiceException {
    try {
        org.jclouds.blobstore.BlobStore bs = getBlobStoreContext(arn, clientSecret).getBlobStore();
        bs.deleteDirectory(getBucket(arn), jobToBaseKey(job));
    } catch (java.lang.Exception ex) {
        log.error("Error in removing job files or storage key.", ex);
        throw new org.auscope.portal.core.services.PortalServiceException("An unexpected error has occurred while removing job files from S3 storage", ex);
    }
}