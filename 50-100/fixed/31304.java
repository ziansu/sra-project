protected java.lang.Long addToContainer(T t) {
    synchronized(lock) {
        if ((size()) >= (maxSize))
            return null;
        
        long savedId = (idIndicator)++;
        if ((t.getObjectId()) <= 0L) {
            t.setObjectId(savedId);
            availableContainer.put(savedId, t);
        }else {
            availableContainer.put(t.getObjectId(), t);
            savedId = t.getObjectId();
        }
        return savedId;
    }
}