private java.util.List<java.lang.reflect.Field> findRuleAnnotatedFieldsOfTargetType(java.lang.Object testInstance) {
    java.lang.reflect.Field[] declaredFields = testInstance.getClass().getDeclaredFields();
    return java.util.Arrays.asList(declaredFields).stream().filter(( field) -> field.getClass().isAssignableFrom(this.ruleType)).filter(( field) -> field.isAnnotationPresent(this.annotationType)).collect(java.util.stream.Collectors.toList());
}