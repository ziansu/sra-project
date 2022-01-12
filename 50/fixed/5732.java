java.lang.Object get(org.junit.jupiter.api.extension.ExtensionContext.Namespace namespace, java.lang.Object key) {
    org.junit.jupiter.engine.execution.ExtensionValuesStore.StoredValue storedValue = getStoredValue(namespace, key);
    return storedValue == null ? null : storedValue.value;
}