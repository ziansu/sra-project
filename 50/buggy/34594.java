private com.google.common.collect.ImmutableSet<java.lang.String> excludedContentFromProperties(java.lang.String excludedContent) {
    if (com.google.common.base.Strings.isNullOrEmpty(excludedContent)) {
        return com.google.common.collect.ImmutableSet.of();
    }
    return com.google.common.collect.ImmutableSet.copyOf(com.google.common.base.Splitter.on(',').split(excludedUris));
}