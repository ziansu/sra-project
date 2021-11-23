private java.lang.Iterable<nl.esciencecenter.xenon.filesystems.PathAttributes> listPrefix(java.lang.String prefix, boolean recursive) {
    org.jclouds.blobstore.options.ListContainerOptions options = new org.jclouds.blobstore.options.ListContainerOptions().prefix(prefix);
    if (recursive) {
        options = options.recursive();
    }
    final org.jclouds.blobstore.options.ListContainerOptions optionsFinal = options;
    return () -> new nl.esciencecenter.xenon.adaptors.filesystems.jclouds.JCloudsFileSytem.ListingIterator(optionsFinal, context.getBlobStore().list(bucket, optionsFinal));
}