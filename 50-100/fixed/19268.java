private static boolean isCustomAnnotation(java.lang.annotation.Annotation annotation) {
    java.lang.Class annotationType = annotation.annotationType();
    if (com.univocity.parsers.annotations.helpers.AnnotationHelper.customAnnotationTypes.contains(annotationType)) {
        return true;
    }
    if (com.univocity.parsers.annotations.helpers.AnnotationHelper.javaLangAnnotationTypes.contains(annotationType)) {
        return false;
    }
    if (annotationType.getName().startsWith("java.lang.annotation")) {
        com.univocity.parsers.annotations.helpers.AnnotationHelper.javaLangAnnotationTypes.add(annotationType);
        return false;
    }else {
        com.univocity.parsers.annotations.helpers.AnnotationHelper.customAnnotationTypes.add(annotationType);
        return true;
    }
}