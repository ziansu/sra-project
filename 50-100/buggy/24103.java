public static java.util.Set<java.lang.Class<?>> getClassSetWithAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> clazz) {
    java.util.Set<java.lang.Class<?>> ret = new java.util.HashSet<java.lang.Class<?>>();
    for (java.lang.Class<?> cla : com.yxz.mySimpleMVC.config.AnnotationGet.sets) {
        if (cla.isAnnotationPresent(clazz)) {
            ret.add(clazz);
        }
    }
    return ret;
}