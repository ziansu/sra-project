private boolean hasMutipleDependencies(com.emc.storageos.db.client.impl.ColumnField field) {
    java.lang.annotation.Annotation a = this.getRelationAnnotation(field);
    if (a instanceof com.emc.storageos.db.client.model.RelationIndex) {
        return (((com.emc.storageos.db.client.model.RelationIndex) (a)).types().length) > 0;
    }else
        if (a instanceof com.emc.storageos.db.client.model.NamedRelationIndex) {
            return (((com.emc.storageos.db.client.model.NamedRelationIndex) (a)).types().length) > 0;
        }
    
    return false;
}