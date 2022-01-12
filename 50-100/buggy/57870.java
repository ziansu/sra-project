private java.util.Map<java.lang.String, java.lang.String> getMethodMap(java.lang.String className) {
    if ((!(this.methodNameMaps.containsKey(className))) && (!(negativeCacheMethods.contains(className)))) {
        findAndMergeSuperMaps(className);
        if (!(methodNameMaps.containsKey(className))) {
            negativeCacheMethods.add(className);
            return null;
        }
    }
    return fieldNameMaps.get(className);
}