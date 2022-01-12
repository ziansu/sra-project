public static long getBlobSize(java.lang.String blobSizeStr) throws com.github.ambry.rest.RestServiceException {
    try {
        long blobSize = java.lang.Long.parseLong(blobSizeStr);
        if (blobSize < 0) {
            throw new com.github.ambry.rest.RestServiceException(((((com.github.ambry.rest.RestUtils.Headers.BLOB_SIZE) + "[") + blobSize) + "] is less than 0"), RestServiceErrorCode.InvalidArgs);
        }
        return blobSize;
    } catch (java.lang.NumberFormatException e) {
        throw new com.github.ambry.rest.RestServiceException(((((com.github.ambry.rest.RestUtils.Headers.BLOB_SIZE) + "[") + blobSizeStr) + "] could not parsed into a number"), RestServiceErrorCode.InvalidArgs);
    }
}