@java.lang.Override
public com.google.common.base.Optional<java.lang.String> getString(java.lang.String key) {
    key = key.trim();
    final java.lang.String property = properties.getProperty(key);
    return com.google.common.base.Optional.fromNullable(property);
}