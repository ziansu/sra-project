public static <B> com.github.st1hy.collect.RestrictiveClassToInstanceMap create(java.util.Map<java.lang.Class<? extends B>, B> backingMap) {
    com.google.common.collect.MutableClassToInstanceMap<B> instanceMap = com.google.common.collect.MutableClassToInstanceMap.create(backingMap);
    return new com.github.st1hy.collect.MutableRestrictiveClassToInstanceMap(instanceMap);
}