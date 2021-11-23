public static java.util.Set<javax.persistence.metamodel.EntityType<?>> getSubClassEntities(javax.persistence.metamodel.EntityType<?> superEntity, java.util.Set<javax.persistence.metamodel.EntityType<?>> entities) {
    java.util.Set<javax.persistence.metamodel.EntityType<?>> subEntities = new java.util.HashSet<javax.persistence.metamodel.EntityType<?>>();
    if (entities == null) {
        return subEntities;
    }
    for (javax.persistence.metamodel.EntityType<?> entity : entities) {
        subEntities.addAll(org.jarbframework.populator.excel.metamodel.generator.SubclassRetriever.addSubclassEntities(superEntity, entities, entity));
    }
    return subEntities;
}