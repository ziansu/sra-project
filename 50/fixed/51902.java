public static java.util.Collection<com.alibaba.dubbo.registry.Registry> getRegistries() {
    return java.util.Collections.unmodifiableCollection(new java.util.ArrayList<com.alibaba.dubbo.registry.Registry>(com.alibaba.dubbo.registry.support.AbstractRegistryFactory.REGISTRIES.values()));
}