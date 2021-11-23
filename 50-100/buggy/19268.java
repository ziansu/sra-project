private static boolean isCustomAnnotation(java.lang.annotation.Annotation annotation) {
    java.lang.Class annotationType = annotation.annotationType();
    boolean isCustom = com.univocity.parsers.annotations.helpers.AnnotationHelper.customAnnotationTypes.contains(annotationType);
    if (isCustom) {
        return false;
    }
    boolean isJavaLang = com.univocity.parsers.annotations.helpers.AnnotationHelper.javaLangAnnotationTypes.contains(annotationType);
    if (isJavaLang) {
        return true;
    }
    isJavaLang = annotationType.getName().startsWith("java.lang.annotation");
    if (isJavaLang) {
        com.univocity.parsers.annotations.helpers.AnnotationHelper.javaLangAnnotationTypes.add(annotationType);
    }else {
        com.univocity.parsers.annotations.helpers.AnnotationHelper.customAnnotationTypes.add(annotationType);
    }
    return isJavaLang;
}