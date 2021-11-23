@java.lang.Override
public java.util.Set<java.lang.Class<?>> getClasses() {
    java.util.Set<java.lang.Class<?>> resources = new java.util.HashSet<>();
    resources.add(filter.corsFilter.class);
    addRestResourceClasses(resources);
    return resources;
}