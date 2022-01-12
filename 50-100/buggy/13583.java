private void updateJoinEntity(java.lang.String entityNameOrAlias, java.lang.String joinType) {
    java.lang.String name = getEntityName(entityNameOrAlias);
    if (joinedEntities.containsKey(name))
        joinedEntities.get(name).update((isEntityName(entityNameOrAlias) ? null : entityNameOrAlias), joinType);
    else
        joinedEntities.put(name, new org.wikiup.modules.worms.imp.builder.JoinSQLBuilder.SQLJoinEntity(entityNameOrAlias, joinType));
    
}