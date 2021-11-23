public static com.comphenix.protocol.wrappers.WrappedDataWatcher.Serializer fromHandle(java.lang.Object handle) {
    org.apache.commons.lang.Validate.notNull("Handle cannot be null!");
    com.comphenix.protocol.wrappers.WrappedDataWatcher.Registry.initialize();
    for (com.comphenix.protocol.wrappers.WrappedDataWatcher.Serializer serializer : com.comphenix.protocol.wrappers.WrappedDataWatcher.Registry.REGISTRY) {
        if (serializer.getHandle().equals(handle)) {
            return serializer;
        }
    }
    return null;
}