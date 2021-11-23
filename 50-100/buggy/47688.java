public long put(T object, int index) {
    if ((serializer) == null)
        throw new java.lang.NullPointerException("No serializer is set!");
    
    if (!(hasObject(index)))
        return -1;
    
    buffer.setAtPosition(index, true);
    return serializer.serialize(buffer, object, objectSize, index);
}