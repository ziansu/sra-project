public static com.github.st1hy.collect.RestrictiveClassToInstanceMap create(java.util.Map<java.lang.Class<?>, java.lang.Object> backingMap) {
    com.google.common.collect.MutableClassToInstanceMap<java.lang.Object> instanceMap = com.google.common.collect.MutableClassToInstanceMap.create(backingMap);
    return new com.github.st1hy.collect.MutableRestrictiveClassToInstanceMap(instanceMap);
}