public org.kairosdb.client.builder.Metric addTags(java.util.Map<java.lang.String, java.lang.String> tags) {
    com.google.common.base.Preconditions.checkNotNull(tags);
    this.tags.putAll(tags);
    return this;
}