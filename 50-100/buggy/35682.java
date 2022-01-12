@java.lang.Override
public T convert(java.lang.String value) {
    java.lang.String trimmed = java.util.Objects.requireNonNull(value).trim();
    try {
        java.lang.reflect.Method m = enumType.getMethod("valueOf", java.lang.String.class);
        return ((T) (factory.invoke(null, value)));
    } catch (java.lang.Exception e) {
        throw new org.apache.tamaya.ConfigException(((("Invalid enum value '" + value) + "' for ") + (enumType.getName())));
    }
}