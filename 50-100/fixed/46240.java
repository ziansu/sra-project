private static com.spectralogic.ds3client.models.bulk.BulkObject getBlobFromPosition(final com.google.common.collect.ImmutableMultimap<com.spectralogic.ds3client.models.bulk.BulkObject, com.google.common.collect.Range> blobs, final long position) {
    if (com.spectralogic.ds3client.utils.Guard.isMultiMapNullOrEmpty(blobs)) {
        return null;
    }
    for (final com.spectralogic.ds3client.models.bulk.BulkObject bulkObject : blobs.keySet()) {
        if (((bulkObject.getOffset()) <= position) && (position < ((bulkObject.getOffset()) + (bulkObject.getLength())))) {
            return bulkObject;
        }
    }
    return null;
}