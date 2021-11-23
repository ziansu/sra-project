private boolean checkRange(final long position) {
    if (com.spectralogic.ds3client.utils.Guard.isMultiMapNullOrEmpty(ranges))
        return true;
    
    final com.spectralogic.ds3client.models.bulk.BulkObject blob = com.spectralogic.ds3client.helpers.channels.RangedSeekableByteChannel.getBlobFromPosition(ranges, position);
    if (blob == null)
        return false;
    
    final long blobSize = blobSizes.get(blob);
    return ((blob.getOffset()) <= position) && (position <= (((blob.getOffset()) + blobSize) - 1));
}