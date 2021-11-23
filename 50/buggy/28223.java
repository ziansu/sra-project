public boolean isProperty() {
    java.lang.reflect.Method method = getRef().findPropertyAccessor(getPropertyName(), ReflectionUtil.SETTER_PREFIX);
    return method != null;
}