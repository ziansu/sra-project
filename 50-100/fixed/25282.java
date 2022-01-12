@java.lang.Override
public java.lang.String get(java.lang.String key) {
    java.util.Objects.requireNonNull(key, "Key must not be null.");
    org.apache.tamaya.core.internal.PropertyValue value = configEvaluator.evaluteRawValue(key, configurationContext);
    if (value == null) {
        return null;
    }
    value = org.apache.tamaya.core.internal.PropertyFiltering.applyFilter(value, configurationContext);
    if (value != null) {
        return value.getValue();
    }
    return null;
}