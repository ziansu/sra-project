public T removeAndReturn(long index) {
    if ((serializer) == null)
        throw new java.lang.NullPointerException("No serializer is set!");
    
    if (!(hasObject(index)))
        return null;
    
    buffer.setAtPosition(index, false);
    (size)--;
    return serializer.deserialize(buffer, null, objectSize, index);
}