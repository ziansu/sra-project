@java.lang.SuppressWarnings(value = "ReturnOfCollectionOrArrayField")
private java.util.Map<java.lang.String, java.lang.String> asNameMap(final java.lang.Class<?> type) throws java.lang.ClassCastException {
    assert java.lang.Thread.holdsLock(this);
    if (type != (lastNameMapType)) {
        lastNameMap = standard.asNameMap(type, KeyNamePolicy.METHOD_NAME, KeyNamePolicy.UML_IDENTIFIER);
    }
    return lastNameMap;
}