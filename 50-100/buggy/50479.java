public static java.util.Set<java.lang.Class<?>> getClassSetByAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> annotationClass) {
    {
        java.util.Set<java.lang.Class<?>> classSet = new java.util.HashSet<>();
        for (java.lang.Class<?> cls : org.smart4j.framework.helper.ClassHelper.CLASS_SET) {
            if (cls.isAnnotationPresent(annotationClass)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }
}