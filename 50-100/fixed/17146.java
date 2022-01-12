private void addIfPresentInMetadataService(java.util.List<java.lang.String> values, java.lang.String key, java.net.URI metadataService) {
    java.lang.String value = denominator.hook.InstanceMetadataHook.get(metadataService, key);
    com.google.common.base.Preconditions.checkArgument((value != null), "could not retrieve %s from %s", key, metadataService);
    values.add(value);
}