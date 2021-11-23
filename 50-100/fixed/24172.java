public com.spectralogic.ds3client.commands.spectrads3.PutBulkJobSpectraS3Request withMaxUploadSize(final long maxUploadSize) {
    if (maxUploadSize >= (com.spectralogic.ds3client.commands.spectrads3.PutBulkJobSpectraS3Request.MIN_UPLOAD_SIZE_IN_BYTES)) {
        this.getQueryParams().put("max_upload_size", java.lang.Long.toString(maxUploadSize));
    }else {
        this.getQueryParams().put("max_upload_size", com.spectralogic.ds3client.commands.spectrads3.PutBulkJobSpectraS3Request.MAX_UPLOAD_SIZE_IN_BYTES);
    }
    return this;
}