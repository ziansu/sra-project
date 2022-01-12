public boolean isProperty() {
    java.lang.reflect.Method method = findPropertyAccessor(getPropertyName(), ReflectionUtil.SETTER_PREFIX);
    return method != null;
}