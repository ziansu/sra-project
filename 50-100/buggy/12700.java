@java.lang.Override
public int getElementCount(final java.lang.String elementType) {
    if (elementType == null) {
        throw new java.lang.NullPointerException("elementType must not be null.");
    }
    if (!(wrappedMap.containsKey(elementType))) {
        throw new java.lang.IllegalArgumentException("No such type found.");
    }
    org.smurn.jply.ElementType unwrapped = wrappedMap.get(elementType).getUnwrappedType();
    return reader.getElementCount(unwrapped.getName());
}