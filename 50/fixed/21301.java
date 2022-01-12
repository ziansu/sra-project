private org.junit.jupiter.engine.execution.ExtensionValuesStore.StoredValue getStoredValue(org.junit.jupiter.api.extension.ExtensionContext.Namespace namespace, java.lang.Object key) {
    org.junit.jupiter.engine.execution.ExtensionValuesStore.CompositeKey compositeKey = new org.junit.jupiter.engine.execution.ExtensionValuesStore.CompositeKey(namespace, key);
    return this.storedValues.get(compositeKey);
}