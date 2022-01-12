private boolean scanFieldsRelation(java.lang.Class<?> klass, final net.imadz.lifecycle.meta.type.RelationConstraintMetadata relation) {
    for (java.lang.Class<?> c = klass; (java.lang.Object.class) != c; c = c.getSuperclass()) {
        for (java.lang.reflect.Field field : c.getDeclaredFields()) {
            if (hasRelationOnField(relation, field))
                return true;
            
        }
    }
    return false;
}