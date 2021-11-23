private void putStoredValue(org.junit.jupiter.api.extension.ExtensionContext.Namespace namespace, java.lang.Object key, org.junit.jupiter.engine.execution.ExtensionValuesStore.StoredValue storedValue) {
    org.junit.jupiter.engine.execution.ExtensionValuesStore.CompositeKey compositeKey = new org.junit.jupiter.engine.execution.ExtensionValuesStore.CompositeKey(namespace, key);
    storedValues.put(compositeKey, storedValue);
}