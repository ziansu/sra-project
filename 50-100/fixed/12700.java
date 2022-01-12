@java.lang.Override
public int getElementCount(final java.lang.String elementType) {
    if (elementType == null) {
        throw new java.lang.NullPointerException("elementType must not be null.");
    }
    if (!(wrappedMap.containsKey(elementType))) {
        return reader.getElementCount(elementType);
    }
    org.smurn.jply.ElementType unwrapped = wrappedMap.get(elementType).getUnwrappedType();
    return reader.getElementCount(unwrapped.getName());
}