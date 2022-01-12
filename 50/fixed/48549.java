@java.lang.Override
public java.util.Set<java.lang.Class<?>> getClasses() {
    java.util.Set<java.lang.Class<?>> resources = new java.util.HashSet<>();
    addRestResourceClasses(resources);
    return resources;
}