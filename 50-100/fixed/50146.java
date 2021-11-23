public <A extends java.lang.annotation.Annotation> java.util.Collection<java.lang.reflect.Method> getTriggers(java.lang.Class<A> annotationClass, java.lang.String fieldName) {
    java.util.Collection<java.lang.reflect.Method> methods = fieldsToTriggers.get(org.apache.commons.lang3.tuple.Pair.of(annotationClass, fieldName));
    return methods == null ? java.util.Collections.emptyList() : methods;
}