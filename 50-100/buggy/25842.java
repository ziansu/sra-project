private static java.lang.String getAnnotationValue(org.objectweb.asm.tree.AnnotationNode annotation, java.lang.String key, java.lang.Class<?> annotationClass) {
    java.lang.String value = org.spongepowered.asm.util.ASMHelper.getAnnotationValue(annotation, key);
    if (value == null) {
        try {
            value = ((java.lang.String) (org.spongepowered.asm.mixin.Shadow.class.getDeclaredMethod(key).getDefaultValue()));
        } catch (java.lang.NoSuchMethodException ex) {
        }
    }
    return value;
}