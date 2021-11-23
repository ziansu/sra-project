public com.orientechnologies.orient.core.metadata.schema.OType[] getKeyTypes() {
    acquireSharedLock();
    try {
        if ((indexDefinition) == null)
            return null;
        
        return indexDefinition.getTypes();
    } finally {
        releaseSharedLock();
    }
}