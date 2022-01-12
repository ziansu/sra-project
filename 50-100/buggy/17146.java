private void addIfPresentInMetadataService(com.google.common.collect.ImmutableList.Builder<java.lang.String> valuesBuilder, java.lang.String key, java.net.URI metadataService) throws java.lang.IllegalArgumentException {
    java.lang.String value = denominator.hook.InstanceMetadataHook.get(metadataService, key);
    com.google.common.base.Preconditions.checkArgument((value != null), "could not retrieve %s from %s", key, metadataService);
    valuesBuilder.add(value);
}