public <T> org.deadsimple.mundungus.EntityCursor<T> findAll(final java.lang.Class<T> clazz) {
    if (org.deadsimple.mundungus.ReflectionUtils.isCollection(clazz)) {
        final org.deadsimple.mundungus.DBCollection collection = this.getDbConnection().getCollection(org.deadsimple.mundungus.ReflectionUtils.mapClassNameToCollectionName(clazz));
        return new org.deadsimple.mundungus.EntityCursor<T>(collection.find());
    }
    throw new org.deadsimple.mundungus.exception.MappingException(java.text.MessageFormat.format("Class {0} is not mapped by Mundungus.", clazz.getClass().getSimpleName()));
}