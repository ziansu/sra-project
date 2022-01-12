private org.infinispan.metadata.Metadata applyDefaultMetadata(org.infinispan.metadata.Metadata metadata) {
    if (metadata == null) {
        return defaultMetadata;
    }
    org.infinispan.metadata.Metadata.Builder builder = metadata.builder();
    return builder != null ? builder.merge(defaultMetadata).build() : metadata;
}