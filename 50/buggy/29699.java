protected boolean hasDateCreated(org.grails.datastore.mapping.model.PersistentEntity entity) {
    return (entitiesWithDateCreated.containsKey(entity)) && (entitiesWithDateCreated.get(entity));
}