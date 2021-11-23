public T removeAndReturn(long index, T object) {
    if ((serializer) == null)
        throw new java.lang.NullPointerException("No serializer is set!");
    
    if (!(hasObject(index)))
        return null;
    
    buffer.setAtPosition(index, false);
    (size)--;
    return serializer.deserialize(buffer, object, objectSize, index);
}