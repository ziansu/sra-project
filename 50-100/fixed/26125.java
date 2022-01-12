private static java.util.List<java.lang.reflect.Method> getSuperclassMethods(java.lang.Class<?> clazz, org.junit.gen5.commons.util.ReflectionUtils.MethodSortOrder sortOrder) {
    if ((clazz != (java.lang.Object.class)) && ((clazz.getSuperclass()) != (java.lang.Object.class))) {
        return org.junit.gen5.commons.util.ReflectionUtils.findAllMethodsInHierarchy(clazz.getSuperclass(), sortOrder);
    }else {
        return java.util.Collections.emptyList();
    }
}