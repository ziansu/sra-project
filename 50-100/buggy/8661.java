public org.structr.core.GraphObject getEntity() throws org.structr.common.error.FrameworkException {
    final org.structr.core.GraphObject entity = idResource.getEntity();
    if (entity != null) {
        java.lang.String type = org.structr.schema.SchemaHelper.normalizeEntityName(typeResource.getRawType());
        java.lang.Class parentClass = org.structr.schema.SchemaHelper.getEntityClassForRawType(type);
        if (org.structr.core.graph.search.SearchCommand.getAllSubtypesAsStringSet(parentClass.getSimpleName()).contains(type)) {
            return entity;
        }
    }
    throw new org.structr.rest.exception.NotFoundException();
}