@java.lang.SuppressWarnings(value = "rawtypes")
public <T extends hudson.model.Descriptor> T getDescriptorByType(java.lang.Class<T> type) {
    return getInstance().getDescriptorByType(type);
}